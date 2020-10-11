package quang.company.furama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.furama.model.Services;
import quang.company.furama.service.ServiceService;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "service")
public class ServiceController {

    @Autowired
    ServiceService serviceService;


    @GetMapping
    public ModelAndView showAll() {
        return new ModelAndView("service/home", "list", serviceService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("service", new Services());

        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(Services service, BindingResult bindingResult, RedirectAttributes redirect) {
//        new Contract().validate(contract, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            ModelAndView modelAndView = new ModelAndView("contract/home");
//            return modelAndView;
//        }
//
//        else {
            ModelAndView modelAndView = new ModelAndView("redirect:/service");

            serviceService.save(service);
            return modelAndView;
//        }
    }

    //edit
    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("contract/home");
        modelAndView.addObject("contract", serviceService.findById(id));
        modelAndView.addObject("checkOption", 1);
        modelAndView.addObject("list", serviceService.findAll());

        return modelAndView;
    }
//
    @GetMapping("/edit")
    public ModelAndView edit( Services service, RedirectAttributes redirect) {
//        new Product().validate(product, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            long id= contract.getIdCustomer();
//            ModelAndView modelAndView = new ModelAndView("contract/home");
////            modelAndView.addObject("product", product);
//            modelAndView.addObject("checkOption", 1);
//            modelAndView.addObject("id", id);
//            modelAndView.addObject("list", productService.findAll(pageable));
//            modelAndView.addObject("listCategory", categoryService.findAll());
//            return modelAndView;
//        } else {
            ModelAndView modelAndView = new ModelAndView("redirect:/service");
            serviceService.save(service);
//            redirect.addFlashAttribute("messageProduct", "Edit Succession");
            return modelAndView;
        }

//    }
//
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView(("redirect:/service"));
        serviceService.deleteById(id);
        return modelAndView;
    }
//
    @GetMapping("/deleteSelect")
    public ModelAndView deleteSelect(@RequestParam Long[] select) {
        ModelAndView modelAndView = new ModelAndView("redirect:/service");
        List<Long> listDelete = new ArrayList<>();
        for (Long longs : select) {
            listDelete.add(longs);
        }
        modelAndView.addObject("listSelect", listDelete);
        serviceService.deleteAllByIdIn(listDelete);
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
