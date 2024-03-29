package com.codegym.controllers;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.LoginRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {

//    @GetMapping("/home")
//    public ModelAndView home(){
//        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
//        return modelAndView;
//    }
//    @PostMapping("/login")
//    public ModelAndView login(@ModelAttribute("login") Login login){
//        User user = LoginRepository.checkLogin(login);
//        if(user == null){
//            ModelAndView modelAndView = new ModelAndView("error");
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("user");
//            modelAndView.addObject("user", user);
//            return modelAndView;
//        }
//    }

    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home","login",new Login());
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = LoginRepository.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }
        else {
            return new ModelAndView("user","user",user);
        }
    }
}