package controllers;

import model.GirlFriendInCodeGym;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GirlfriendController {

    @GetMapping(value = "/girlfriend")
    public ModelAndView getList(){
        List<GirlFriendInCodeGym> list =new ArrayList<>();
        list.add(new GirlFriendInCodeGym("Thuy Trang","23","C09"));
        list.add(new GirlFriendInCodeGym("Yen Nhi","23","C07"));
        list.add(new GirlFriendInCodeGym("Quynh Mai","25","C06"));
        return new ModelAndView("listGirlfriend","list",list);
    }
//    @GetMapping(value = "/girlfriend1")
//    public ModelAndView getList1(){
//        ModelAndView modelAndView = new ModelAndView("listGirlfriend");
//        List<GirlFriendInCodeGym> list =new ArrayList<>();
//        list.add(new GirlFriendInCodeGym("Thuy Trang","23","C09"));
//        list.add(new GirlFriendInCodeGym("Yen Nhi","23","C07"));
//        list.add(new GirlFriendInCodeGym("Quynh Mai","25","C06"));
//        modelAndView.addObject("list",list);
//        return modelAndView;
//    }
//    @GetMapping(value = "/girlfriend")
//    public ModelAndView getGirl(){
//        return new ModelAndView("girlfriend","girlfriend",new GirlFriendInCodeGym("Thuy Trang","24","C09"));
        };
//    }
