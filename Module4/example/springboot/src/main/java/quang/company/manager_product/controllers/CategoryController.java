package quang.company.manager_product.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import quang.company.manager_product.service.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView("category/list");
        modelAndView.addObject("list", categoryService.findAll());
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView view(@PathVariable int id) {
        return new ModelAndView("category/categoryDetail", "category", categoryService.findById(id));
    }
}