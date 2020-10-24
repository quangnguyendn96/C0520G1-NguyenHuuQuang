package quang.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.model.Student;
import quang.company.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public ModelAndView showPage() {
        List<Student> list = studentService.showAll();
        return new ModelAndView("home", "listStudent", list);
    }

    @GetMapping("create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("student", new Student());

        List<Integer> gender = new ArrayList<>();
        gender.add(1);
        gender.add(2);

        modelAndView.addObject("gender", gender);
        return modelAndView;
    }

    @PostMapping("create")
    public String create(Student student, RedirectAttributes redirect) {
        studentService.save(student);
        redirect.addFlashAttribute("message","Create succession");
        return "redirect:''";
    }

}
