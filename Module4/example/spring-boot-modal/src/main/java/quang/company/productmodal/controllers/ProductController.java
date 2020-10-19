package quang.company.productmodal.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.productmodal.model.Category;
//import quang.company.productmodal.model.Factory;
import quang.company.productmodal.model.Product;
import quang.company.productmodal.service.CategoryService;
//import quang.company.productmodal.service.FactoryService;
import quang.company.productmodal.service.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
//    @Autowired
//    FactoryService factoryService;

    //    @ModelAttribute("list")
//    public Page<Product> getList (Pageable pageable) {
//        return productService.findAllByStatusProductTrue(pageable);
//    }
    @ModelAttribute("listCategory")
    public List<Category> getListCategory() {
        return categoryService.findAll();
    }
//    @ModelAttribute("listFactory")
//    public List<Factory> getListFactory ( ) {
//        return factoryService.findAll();
//    }


    @GetMapping
    public ModelAndView showAll(@PageableDefault(value = 5) Pageable pageable) {
//    public ModelAndView showAll(@PageableDefault(value = 5) @SortDefault(sort = {"customerName","customerId"}, direction = Sort.Direction.DESC)Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("list", productService.findAllByStatusProductTrue(pageable));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Validated Product product, BindingResult bindingResult, RedirectAttributes redirect,@PageableDefault(value = 5) Pageable pageable) {
//        new Product().validate(product, bindingResult);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("product/list");
            modelAndView.addObject("list", productService.findAllByStatusProductTrue(pageable));
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/");
            product.setStatusProduct(true);
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
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView edit(@Validated Product product, BindingResult bindingResult, RedirectAttributes redirect) {
//        new Product().validate(product, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            return new ModelAndView("product/edit");
//        } else {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        productService.save(product);
        redirect.addFlashAttribute("messageProduct", "Edit Succession");
        return modelAndView;
    }

    @GetMapping("/deleteSelect")
    public ModelAndView deleteSelect(@RequestParam Long[] select, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        List<Long> listDelete = new ArrayList<>(Arrays.asList(select));
        redirect.addFlashAttribute("messageProduct", "Delete Succession");
        modelAndView.addObject("listSelect", listDelete);
        productService.deleteByCheckBox(listDelete);
        return modelAndView;
    }

    @GetMapping("/searchByCategory")
    public ModelAndView searchByCategory(@RequestParam String search, int category, @PageableDefault(value = 5) Pageable pageable) {
        if (category == 0) {
            return new ModelAndView("redirect:/");
        }
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("list", productService.findBlogByName(category, search, pageable));
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("searchCate", search);
        modelAndView.addObject("category", categoryService.findById(category));
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String searchField,  @PageableDefault(value = 5) Pageable pageable) {

        ModelAndView modelAndView = new ModelAndView("product/list");
//        modelAndView.addObject("list", productService.findAllByNameProductContaining(search, pageable));
//        modelAndView.addObject("searchValue", search);
//        modelAndView.addObject("product", new Product());
//
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetailPage(@PathVariable long id) {

        ModelAndView modelAndView = new ModelAndView("product/detail");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }
}

//    }

//    @GetMapping("/delete/{id}")
//    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
//        ModelAndView modelAndView = new ModelAndView(("redirect:/"));
//        redirect.addFlashAttribute("messageProduct", "Delete Succession");
//        productService.delete(id);
//        return modelAndView;
//    }