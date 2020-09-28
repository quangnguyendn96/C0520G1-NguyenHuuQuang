package quang.company.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.blog.model.Blog;
import quang.company.blog.model.Category;
import quang.company.blog.service.BlogService;
import quang.company.blog.service.CategoryService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("list", blogService.findAll());
        List<Category> typeCategory = categoryService.findAll();
        modelAndView.addObject("typeCategory", typeCategory);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog", new Blog());

        List<Category> typeCategory = categoryService.findAll();
        modelAndView.addObject("typeCategory", typeCategory);
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(Blog blog, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        blogService.save(blog);
        redirect.addFlashAttribute("messageProduct", "Create Succession");
        return modelAndView;
    }

    //edit
    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blog", blogService.findById(id));
        modelAndView.addObject("checkOption", 1);
        modelAndView.addObject("list", blogService.findAll());

        List<Category> typeCategory = categoryService.findAll();
        modelAndView.addObject("typeCategory", typeCategory);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView edit(Blog blog, RedirectAttributes redirect) {

        ModelAndView modelAndView = new ModelAndView("redirect:/");
        blogService.save(blog);
        redirect.addFlashAttribute("messageProduct", "Edit Succession");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView(("redirect:/"));
        redirect.addFlashAttribute("messageProduct", "Delete Succession");
        blogService.delete(id);
        return modelAndView;
    }
   @GetMapping("/search")
    public ModelAndView search(@RequestParam String search, int category){
       ModelAndView modelAndView = new ModelAndView("blog/list");
       modelAndView.addObject("list", blogService.findBlogByName(category,search));
       return modelAndView;
   }

}
