package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @GetMapping
    public ModelAndView showForm(){
      return new ModelAndView("employee/create","employee",new Employee());
   }
     @PostMapping(value = "/addEmployee")
    public ModelAndView submit(@ModelAttribute("employee") Employee employee){
       return new ModelAndView("employee/info","employee",employee);

     }

}

