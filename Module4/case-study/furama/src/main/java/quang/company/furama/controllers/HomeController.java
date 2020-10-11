package quang.company.furama.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping(value = {"/home","/"})
public class HomeController {
    @GetMapping
    public String homePage(Model model){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        model.addAttribute("time",formatter.format(date));

        return "homePage/home";
    }

    @GetMapping("/login")
    public String login(){
        return "login-register";
    }
}
