package controllers;

import model.Settings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class FormController {
    @GetMapping
    public ModelAndView showForm(){
       return new ModelAndView("home","setting",new Settings());
//        List<String> languageList = new ArrayList<>();
//        languageList.add("English");
//        languageList.add("France");
//        languageList.add("Laos");
//        modelAndView.addObject("languageList", languageList);
//        return modelAndView;
    }
    @PostMapping("/getEmail")
    public ModelAndView getForm(@ModelAttribute("setting") Settings setting){
        return new ModelAndView("show","setting",setting);
    }
}
