package quang.company.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.example.model.Question;
import quang.company.example.model.QuestionType;
import quang.company.example.model.User;
import quang.company.example.service.QuestionService;
import quang.company.example.service.QuestionTypeService;
import quang.company.example.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @Autowired
    QuestionTypeService questionTypeService;
    @Autowired
    UserService userService;

    //    @ModelAttribute("list")
//    public Page<Product> getList (Pageable pageable) {
//        return productService.findAllByStatusProductTrue(pageable);
//    }
    @ModelAttribute("listQuestion")
    public List<QuestionType> getListQuestion() {
        return questionTypeService.findAll();
    }
    @ModelAttribute("listUser")
    public List<User> getListUser() {
        return userService.findAll();
    }


    @GetMapping("")
    public ModelAndView showAll() {
//    public ModelAndView showAll(@PageableDefault(value = 5) @SortDefault(sort = {"nameProduct"}, direction = Sort.Direction.DESC)Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("question/list");
        modelAndView.addObject("list", questionService.findAll());
        return modelAndView;
    }


    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("question/create2");
        modelAndView.addObject("question", new Question());
        return modelAndView;
    }


    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("question") Question question, BindingResult bindingResult) {

//        if (bindingResult.hasErrors()) {
//            return "question/create";
//        } else {
//            System.out.println("c");

        questionService.save(question);


        return "redirect:/";
    }


    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("question/edit");
        modelAndView.addObject("question", questionService.findById(id));
        return modelAndView;
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute("question") Question question, RedirectAttributes redirect, Model model) {
//        new Product().validate(product, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
////            model.addAttribute("option", 1);
//            model.addAttribute("product",new Product());
//            model.addAttribute("list", productService.findAllByStatusProductTrue(pageable));
//            return ("product/list");
//        } else {
//            product.setStatusProduct(true);
            questionService.save(question);
//            redirect.addFlashAttribute("messageProduct", "Edit Succession");
            return "redirect:/";
        }


//    @GetMapping("/deleteSelect")
//    public ModelAndView deleteSelect(@RequestParam Long[] select, RedirectAttributes redirect) {
//        ModelAndView modelAndView = new ModelAndView("redirect:/");
//        List<Long> listDelete = new ArrayList<>(Arrays.asList(select));
//        redirect.addFlashAttribute("messageProduct", "Delete Succession");
//        modelAndView.addObject("listSelect", listDelete);
//        productService.deleteByCheckBox(listDelete);
//        return modelAndView;
//    }

    //    @GetMapping("/searchByCategory")
//    public ModelAndView searchByCategory(@RequestParam String search, int category, @PageableDefault(value = 5) Pageable pageable) {
//        if (category == 0) {
//            return new ModelAndView("redirect:/");
//        }
//        ModelAndView modelAndView = new ModelAndView("product/list");
//        modelAndView.addObject("list", productService.findBlogByName(category, search, pageable));
//        modelAndView.addObject("product", new Product());
//        modelAndView.addObject("searchCate", search);
//        modelAndView.addObject("category", category);
//        return modelAndView;
//    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetailPage(@PathVariable long id) {

        ModelAndView modelAndView = new ModelAndView("question/detail");
        modelAndView.addObject("question", questionService.findById(id));
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam int searchField, String search) {

        ModelAndView modelAndView = new ModelAndView("question/list");
        switch (searchField) {
            case 0:
                modelAndView.addObject("list", questionService.findAllField(search));
                break;
            case 1:
                modelAndView.addObject("list", questionService.findAllSelect(search));
                break;
        }
        modelAndView.addObject("searchValue", search);
        modelAndView.addObject("searchField", searchField);
        modelAndView.addObject("question", new Question());
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView(("redirect:/"));
        redirect.addFlashAttribute("messageProduct", "Delete Succession");
        questionService.deleteById(id);
        return modelAndView;
    }
}