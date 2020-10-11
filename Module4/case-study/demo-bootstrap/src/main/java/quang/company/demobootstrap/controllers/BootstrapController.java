package quang.company.demobootstrap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BootstrapController {

    @GetMapping
    public String show(){
        return "modalCreate";
    }
    @GetMapping("/modal")
    public String show1(){
        return "modal";
    }
}
