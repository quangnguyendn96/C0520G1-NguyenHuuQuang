package quang.company.furama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import quang.company.furama.model.User;
import quang.company.furama.model.UserSession;
import quang.company.furama.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller

@RequestMapping(value = {"/home", "/"})

public class HomeController {

    @Autowired
    UserService userService;


    @GetMapping
    public String homePage(Model model) {
        model.addAttribute("user", new User());
        return "homePage/home";
    }


    @GetMapping("/login")
    public String showRegister(Model model) {
        model.addAttribute("user", new User());
        return "homePage/login";
    }


    //    @PostMapping("/login")
////  HttpServletResponse response) {
//    public String getUser(User user, Model model) {
//        model.addAttribute("userLogin1", user.getUserName());
//        return "redirect:/";
//    }
//
    @PostMapping("/register")
    public String register(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode(user.getPassword());
        userService.save(new User(user.getUserName(), password, true, null));
        return "redirect:/";
    }

    @GetMapping("/403")
    public String error403() {
        return "common/403";
    }
}

