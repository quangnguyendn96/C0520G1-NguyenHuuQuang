package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CalculatorService;

@Controller
@RequestMapping("")
public class CalculatorController {
    @GetMapping
    public String show() {
        return "calculator";
    }

    @GetMapping("/{operate}")
    public ModelAndView calculator(@RequestParam Double num1, Double num2, @PathVariable String operate)  {
        return new ModelAndView("calculator", "calculator", CalculatorService.calculator(num1, num2, operate));
        }
}
