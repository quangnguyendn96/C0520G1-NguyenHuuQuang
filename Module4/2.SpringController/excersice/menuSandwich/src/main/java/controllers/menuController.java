package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("")
public class menuController {
//        @PostMapping
//    public String menu(@RequestParam String menu, Model model){
//            List list = Arrays.asList(menu);
//            if(list.size() == 0)
//            model.addAttribute("list", list);
//       return "sandwich";
//    }
//    @GetMapping
//    public String menu1(){
//        return "sandwich";
//    }
    @GetMapping
    public String menu(Model model, HttpServletRequest request) {
        String[] menu = request.getParameterValues("menu");
        if (menu == null) {
        } else {
            List list = Arrays.asList(menu);
            model.addAttribute("list", list);
        }
        return "sandwich";
    }
}
