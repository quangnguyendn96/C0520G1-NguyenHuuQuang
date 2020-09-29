package quang.company.manager_product.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.manager_product.model.Product;
import quang.company.manager_product.service.CategoryService;
import quang.company.manager_product.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;


    @GetMapping
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("list", productService.findAll());
        modelAndView.addObject("listCategory", categoryService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("checkCreate", 1);
//        modelAndView.addObject("checkOption",1);
        modelAndView.addObject("list", productService.findAll());
        modelAndView.addObject("listCategory", categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Validated Product product, BindingResult bindingResult, RedirectAttributes redirect) {
        new Product().validate(product, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("product/list");
            modelAndView.addObject("list", productService.findAll());
            modelAndView.addObject("listCategory", categoryService.findAll());
            modelAndView.addObject("checkCreate", 1);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/");
            productService.save(product);
            redirect.addFlashAttribute("messageProduct", "Create Succession");
            return modelAndView;
        }
    }

    //edit
    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("product", productService.findById(id));
        modelAndView.addObject("checkOption", 1);
        modelAndView.addObject("list", productService.findAll());
        modelAndView.addObject("listCategory", categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView edit(@Validated Product product, BindingResult bindingResult, RedirectAttributes redirect) {
        new Product().validate(product, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("product/list");
            modelAndView.addObject("product", productService.findById(product.getIdProduct()));
            modelAndView.addObject("checkOption", 1);
            modelAndView.addObject("list", productService.findAll());
            modelAndView.addObject("listCategory", categoryService.findAll());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/");
            productService.save(product);
            redirect.addFlashAttribute("messageProduct", "Edit Succession");
            return modelAndView;
        }

    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView(("redirect:/"));
        redirect.addFlashAttribute("messageProduct", "Delete Succession");
        productService.delete(id);
        return modelAndView;
    }

    @GetMapping("/deleteSelect")
    public ModelAndView deleteSelect(@RequestParam Long[] select) {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        List<Long> delete = new ArrayList<>();
        for (Long longs : select) {
            delete.add(longs);
        }
        modelAndView.addObject("listSelect", delete);
        productService.deleteAllByIdProductIn(delete);
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String search, int category) {
        if (category == 0) {
            return new ModelAndView("redirect:/");
        }
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("list", productService.findBlogByName(category, search));
        modelAndView.addObject("listCategory", categoryService.findAll());
        return modelAndView;
    }
}
