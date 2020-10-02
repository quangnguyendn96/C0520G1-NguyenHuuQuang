package quang.company.cartsession.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.cartsession.model.CdProduct;
import quang.company.cartsession.service.CdProductService;

@Controller
@RequestMapping
public class CdProductController {
    @Autowired
    private CdProductService cdProductService;

    @GetMapping
    public ModelAndView showHome(){
        return new ModelAndView("cdProduct/home","listCdProduct", cdProductService.findAll());
    }

    @GetMapping("/cdProduct/{id}")
    public ModelAndView showDetailPage(@PathVariable long id) {
        return new ModelAndView("cdProduct/detail","cdProduct", cdProductService.findById(id));
    }

    @GetMapping("cdProduct/create")
    public ModelAndView showCreatePage(){
        return new ModelAndView("cdProduct/create", "cdProduct", new CdProduct());
    }

    @PostMapping("cdProduct/create")
    public String createProduct(@ModelAttribute CdProduct cdProduct, RedirectAttributes redirectAttributes){
        cdProductService.save(cdProduct);
        redirectAttributes.addFlashAttribute("success","Create new product name: " + cdProduct.getName());
        return "redirect:/";
    }
}
