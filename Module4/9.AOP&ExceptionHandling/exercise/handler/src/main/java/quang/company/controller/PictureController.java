package quang.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import quang.company.model.Picture;
import quang.company.service.ErrorBadLanguage;
import quang.company.service.PictureService;
import quang.company.service.PictureServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller

public class PictureController {
    @Autowired
    PictureService pictureService;
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
    public String showPagePost(Picture picture) throws ErrorBadLanguage {
        for(int i = 0; i < pictureService.prohibit().size();i++){
            if(picture.getFeedback().contains(pictureService.prohibit().get(i))){
                throw new ErrorBadLanguage();
            }
        }

        pictureService.save(picture);
        return "redirect:/";
    }

//    @GetMapping("/like/{id}")
//    public String likeComment(@PathVariable int id, Model model){
//        pictureService.
//        picture.setTotalLike(picture.getTotalLike()+1);
//        model.addAttribute("picture",picture);
//        return "redirect:/";
//    }
}
