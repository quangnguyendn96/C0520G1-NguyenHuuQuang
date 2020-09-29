package quang.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import quang.company.model.User;
import quang.company.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", userService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Validated User user, BindingResult bindingResult, RedirectAttributes redirect) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("create");
            return modelAndView;
        } else {
            userService.save(user);
            redirect.addFlashAttribute("messageElement", "Create Succession");
            ModelAndView modelAndView = new ModelAndView("redirect:/");
            return modelAndView;
        }
    }
}
