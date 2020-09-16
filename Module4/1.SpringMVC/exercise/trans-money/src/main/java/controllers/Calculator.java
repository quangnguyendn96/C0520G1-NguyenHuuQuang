package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Calculator {
    @GetMapping(value = "")
    public String showCalculator(){
        return "calculator";
    }
    @GetMapping(value = "/trans")
    public ModelAndView getCalculator(HttpServletRequest request){
        int a =  Integer.parseInt(request.getParameter("usd"));
        int result = a*23000;
        return new ModelAndView("calculator","result",result);
    }
}
