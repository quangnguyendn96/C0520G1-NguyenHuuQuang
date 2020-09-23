package quang.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.model.Product;
import quang.company.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String showList(Model model){
        List<Product> list = productService.showAll();
        model.addAttribute("list",list);
        return "home";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String create(Product product, RedirectAttributes attributes){
        productService.save(product);
        attributes.addFlashAttribute("success","Create succession");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model){
       Product product = productService.findByName(id);
        model.addAttribute("product",product);
        return "edit";
    }
    @PostMapping("/edit")
    public String showEdit(Product product, RedirectAttributes attributes){
        productService.update(product.getId(),product);
        attributes.addFlashAttribute("success","Edit succession");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, RedirectAttributes attributes){
      productService.remove(id);
        attributes.addFlashAttribute("success","Delete succession");
        return "redirect:/";
    }
    @GetMapping("/view/{id}")
    public String showView(@PathVariable int id, Model model){
        Product product = productService.findByName(id);
        List<Product> list = new ArrayList<>();
        list.add(product);
        model.addAttribute("list",list);
        return "home";
    }
}
