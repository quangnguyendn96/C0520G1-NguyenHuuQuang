package quang.company.furama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.furama.model.Services;
import quang.company.furama.model.TypeRent;
import quang.company.furama.model.TypeService;
import quang.company.furama.service.ServiceService;
import quang.company.furama.service.TypeRentService;
import quang.company.furama.service.TypeServiceService;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "service")
public class ServiceController {

    @Autowired
    ServiceService serviceService;
    @Autowired
    TypeRentService typeRentService;
    @Autowired
    TypeServiceService typeServiceService;

    @ModelAttribute("listTypeRent")
    public List<TypeRent> getRentTypeList () {
        return typeRentService.findAll();
    }

    @ModelAttribute("listTypeService")
    public List<TypeService> getRentTypeService () {
        return typeServiceService.findAll();
    }


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
    public String create(@Validated @ModelAttribute("service") Services service, BindingResult bindingResult, RedirectAttributes redirect) {
        new Services().validate(service, bindingResult);
        if (bindingResult.hasFieldErrors()) {
//
            return "service/create";
        }
        else {
            serviceService.save(service);
            return "redirect:/service";
        }
    }

    //edit
    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable String id) {
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
    public ModelAndView delete(@PathVariable("id") String id, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView(("redirect:/service"));
        serviceService.deleteById(id);
        return modelAndView;
    }
//
    @GetMapping("/deleteSelect")
    public ModelAndView deleteSelect(@RequestParam String[] select) {
        ModelAndView modelAndView = new ModelAndView("redirect:/service");
        List<String> listDelete = new ArrayList<>();
        for (String str : select) {
            listDelete.add(str);
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
