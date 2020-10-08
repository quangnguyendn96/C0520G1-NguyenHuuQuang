package quang.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import quang.company.model.Customer;
import quang.company.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequestMapping
public class CustomerController {
    @Autowired
  private CustomerService customerService;

    @GetMapping
    public ModelAndView showAll(){
        ModelAndView modelAndView =new ModelAndView("list");
        List<Customer> list = customerService.findAll();
        modelAndView.addObject("customerList",list);
        return modelAndView;
    }
//    @GetMapping public ModelAndView showCreate(){
//        return new ModelAndView("create","customer",new Customer());
//    }
    @GetMapping("/create")
    public String show(Model model){
        model.addAttribute("customer",new Customer());
        List<String> type = new ArrayList<>();
        type.add("Vip");
        type.add("Diamond");
        type.add("Gold");
        type.add("Sliver");
        type.add("copper");

        model.addAttribute("type",type);

        List<Integer> gender = new ArrayList<>();
        gender.add(1);
        gender.add(2);
        model.addAttribute("gender",gender);
        return "create";
    }
    @PostMapping("/create")
    public ModelAndView create(Customer customer){
         customerService.save(customer);
        ModelAndView modelAndView =new ModelAndView("redirect:/");
        modelAndView.addObject("message","Create succession");
        return modelAndView;
    }
}
