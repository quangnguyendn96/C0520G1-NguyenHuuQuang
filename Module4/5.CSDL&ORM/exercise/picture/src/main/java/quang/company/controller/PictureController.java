package quang.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quang.company.model.Picture;
import quang.company.repository.PictureRepository;
import quang.company.service.PictureService;
import quang.company.service.PictureServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PictureController {
    PictureService pictureService = new PictureServiceImp();
    @GetMapping
    public String showPage(Model model){
        model.addAttribute("picture",new Picture());
        List<Integer> rate = new ArrayList<>();
        rate.add(1);
        rate.add(2);
        rate.add(3);
        rate.add(4);
        rate.add(5);
        model.addAttribute("rate",rate);
        model.addAttribute("list",pictureService.findAll());
        return "home";
    }
    @PostMapping
    public String showPagePost(Picture picture, Model model){
        pictureService.save(picture);
        return "redirect:/";
    }
    @GetMapping("/like/{id}")
    public String likeComment(Picture picture, Model model){
        picture.setTotalLike(picture.getTotalLike()+1);
        model.addAttribute("picture",picture);
        return "redirect:/";
    }
}
