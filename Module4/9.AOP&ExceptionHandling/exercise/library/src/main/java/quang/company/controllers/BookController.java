package quang.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quang.company.model.Book;
import quang.company.service.BookService;

import java.util.List;

@Controller
@RequestMapping("")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String showHome(Model model) {
        List<Book> list = bookService.findAll();
        model.addAttribute("list", list);
        return "home";
    }

}
