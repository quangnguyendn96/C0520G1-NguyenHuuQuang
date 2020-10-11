package quang.company.furama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.furama.model.Customer;
import quang.company.furama.service.CustomerService;
import quang.company.furama.service.TypeCustomerService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    TypeCustomerService typeCustomerService;
    @GetMapping
    public ModelAndView showAll() {
        return new ModelAndView("customer/home", "list", customerService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("listType", typeCustomerService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(Customer customer, BindingResult bindingResult, RedirectAttributes redirect) {
//        new Customer().validate(customer, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            ModelAndView modelAndView = new ModelAndView("customer/home");
//            return modelAndView;
//        }
//
//        else {
            ModelAndView modelAndView = new ModelAndView("redirect:/customer");

            customerService.save(customer);
            return modelAndView;
//        }
    }

    //edit
    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("customer/home");
        modelAndView.addObject("customer", customerService.findById(id));
        modelAndView.addObject("checkOption", 1);
        modelAndView.addObject("list", customerService.findAll());
        modelAndView.addObject("listType", typeCustomerService.findAll());
        return modelAndView;
    }
//
    @GetMapping("/edit")
    public ModelAndView edit( Customer customer, RedirectAttributes redirect) {
//        new Product().validate(product, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            long id= customer.getIdCustomer();
//            ModelAndView modelAndView = new ModelAndView("customer/home");
////            modelAndView.addObject("product", product);
//            modelAndView.addObject("checkOption", 1);
//            modelAndView.addObject("id", id);
//            modelAndView.addObject("list", productService.findAll(pageable));
//            modelAndView.addObject("listCategory", categoryService.findAll());
//            return modelAndView;
//        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/customer");
            customerService.save(customer);
//            redirect.addFlashAttribute("messageProduct", "Edit Succession");
            return modelAndView;
        }

//    }
//
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView(("redirect:/customer"));
        customerService.deleteById(id);
        return modelAndView;
    }
//
    @GetMapping("/deleteSelect")
    public ModelAndView deleteSelect(@RequestParam Long[] select) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        List<Long> listDelete = new ArrayList<>();
        for (Long longs : select) {
            listDelete.add(longs);
        }
        modelAndView.addObject("listSelect", listDelete);
        customerService.deleteAllByIdIn(listDelete);
        return modelAndView;
    }
//
//    @GetMapping("/search")
////    public ModelAndView search(@RequestParam String search, int category,@PageableDefault(value = 5) Pageable pageable) {
////        if (category == 0) {
////            return new ModelAndView("redirect:/");
////        }
////        ModelAndView modelAndView = new ModelAndView("product/list");
////        modelAndView.addObject("list", productService.findBlogByName(category, search,pageable));
////        modelAndView.addObject("listCategory", categoryService.findAll());
////        modelAndView.addObject("category", categoryService.findById(category));
////        return modelAndView;
////    }
}
