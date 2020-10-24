package quang.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.model.Book;
import quang.company.model.Code;
import quang.company.service.BookService;
import quang.company.service.CodeService;

import java.util.List;

@Controller
@RequestMapping("")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CodeService codeService;

    @GetMapping
    public String showHome(Model model) {
        List<Book> list = bookService.findAll();
        model.addAttribute("list", list);
        return "home";
    }

    @GetMapping("view/{id}")
    public String getBook(@PathVariable int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("bookDetail", book);
        return "bookDetail";
    }

    @GetMapping("book/{id}")
    public String getBorrowBook(@PathVariable int id, RedirectAttributes redirect) {
        Book book1 = bookService.findById(id);
        if (book1.getAmount() == 0) {
            throw new OutOfMemoryError("Out of Book");
        }
        book1.setAmount(book1.getAmount() - 1);
        bookService.save(book1);

        Code code = new Code();

        code.setCodeBook((int) (Math.random() * 100000));
        code.setBook(book1);
        codeService.save(code);

        redirect.addFlashAttribute("code", code.getCodeBook());

        return "redirect:/";
    }

    @GetMapping("book/return")
    public String showReturnBook() {
        return "return";
    }

    @PostMapping("book/return")
    public String getReturnBook(@RequestParam("codeReturn") int codeReturn, RedirectAttributes redirect) {
        Code code = codeService.findByCodeBook(codeReturn);
        if (code == null) {
            throw new NullPointerException("Not found");
        } else {
            codeService.deleteById(code.getIdCode());
            Book book = bookService.findById(code.getBook().getIdBook());
            book.setAmount(book.getAmount() + 1);
            bookService.save(book);
            return "redirect:/";
        }
    }
    @GetMapping("/code/showAll")
    public String showAllCode(Model model){
        List<Code> list = codeService.findAll();
        model.addAttribute("listCode",list);
        return "showAllCode";
    }
}
