package cg.wbd.grandemonstration.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String showList() {
        return "customers/list.jsp";
    }
    @GetMapping("/info")
    public String showInfo(){
        return "/customers/info.jsp";
    }
}
