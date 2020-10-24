//package quang.company.smartphone.Controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//import quang.company.smartphone.model.Smartphone;
//import quang.company.smartphone.service.SmartphoneService;
//
//@Controller
//public class HomeController {
//    @Autowired
//    SmartphoneService smartphoneService;
//
//    @GetMapping("/")
//    public String showIndex() {
//        return "index";
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public Iterable<Smartphone> allPhones() {
//        return smartphoneService.findAll();
//    }
//
//    @GetMapping("")
//    public ModelAndView allPhonesPage() {
//        ModelAndView modelAndView = new ModelAndView("phones/all-phones");
//
//        modelAndView.addObject("allphones", allPhones());
//        return modelAndView;
//    }
//}
