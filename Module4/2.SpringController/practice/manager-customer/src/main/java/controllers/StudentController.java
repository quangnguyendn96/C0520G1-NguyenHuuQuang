package controllers;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import service.StudentService;
import service.StudentServiceImp;

import java.util.List;

@Controller
@RequestMapping("")
public class StudentController {
    StudentService studentService = new StudentServiceImp();

    @GetMapping
    public String showAll(Model model) {
        List<Student> list = studentService.showAll();
        model.addAttribute("list", list);
        return "customer/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, ModelMap modelMap) {
        modelMap.addAttribute("student", studentService.findByName(id));
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String editCustomer(@RequestParam int id, String name, String className, String address) {
        studentService.save(new Student(id, name, className, address));
        return "redirect:/";
    }

    @GetMapping("/create")
    public String createGet() {
        return "customer/create";
    }

    @PostMapping("/create")
    public String create(@RequestParam int id, String name, String className, String address) {
        studentService.update(id, new Student(id, name, className, address));
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        studentService.remove(id);
        return "redirect:/";
    }
}

