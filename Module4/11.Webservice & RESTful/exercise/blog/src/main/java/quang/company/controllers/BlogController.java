package quang.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.model.Blog;
import quang.company.model.Category;
import quang.company.service.BlogService;
import quang.company.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired

    private CategoryService categoryService;


    @GetMapping
    public ResponseEntity<List<Blog>> showAll() {

        List<Blog> list = blogService.findAll();
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else {
            return new ResponseEntity<>(list,HttpStatus.OK);
        }

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


}
