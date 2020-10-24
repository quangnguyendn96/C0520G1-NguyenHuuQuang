package quang.company.furama.controllers;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.validation.BindingResult;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.servlet.ModelAndView;
        import org.springframework.web.servlet.mvc.support.RedirectAttributes;
        import quang.company.furama.model.Contract;

        import quang.company.furama.service.ContractService;

        import java.util.ArrayList;
        import java.util.List;

@Controller
@RequestMapping(value = "contract")
public class ContractController {

    @Autowired
    ContractService contractService;


    @GetMapping
    public ModelAndView showAll() {
        return new ModelAndView("contract/home", "list", contractService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("contract", new Contract());

        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(Contract contract, BindingResult bindingResult, RedirectAttributes redirect) {
//        new Contract().validate(contract, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            ModelAndView modelAndView = new ModelAndView("contract/home");
//            return modelAndView;
//        }
//
//        else {
        ModelAndView modelAndView = new ModelAndView("redirect:/contract");

        contractService.save(contract);
        return modelAndView;
//        }
    }

    //edit
    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("contract/home");
        modelAndView.addObject("contract", contractService.findById(id));
        modelAndView.addObject("checkOption", 1);
        modelAndView.addObject("list", contractService.findAll());

        return modelAndView;
    }
    //
    @GetMapping("/edit")
    public ModelAndView edit( Contract contract, RedirectAttributes redirect) {
//        new Product().validate(product, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            long id= contract.getIdCustomer();
//            ModelAndView modelAndView = new ModelAndView("contract/home");
////            modelAndView.addObject("product", product);
//            modelAndView.addObject("checkOption", 1);
//            modelAndView.addObject("id", id);
//            modelAndView.addObject("list", productService.findAll(pageable));
//            modelAndView.addObject("listCategory", categoryService.findAll());
//            return modelAndView;
//        } else {
        ModelAndView modelAndView = new ModelAndView("redirect:/contract");
        contractService.save(contract);
//            redirect.addFlashAttribute("messageProduct", "Edit Succession");
        return modelAndView;
    }

    //    }
//
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") String id, RedirectAttributes redirect) {
        ModelAndView modelAndView = new ModelAndView(("redirect:/contract"));
        contractService.deleteById(id);
        return modelAndView;
    }
    //
    @GetMapping("/deleteSelect")
    public ModelAndView deleteSelect(@RequestParam String[] select) {
        ModelAndView modelAndView = new ModelAndView("redirect:/contract");
        List<String> listDelete = new ArrayList<>();
        for (String str : select) {
            listDelete.add(str);
        }
        modelAndView.addObject("listSelect", listDelete);
        contractService.deleteAllByIdIn(listDelete);
        return modelAndView;
    }
//
//    @GetMapping("/search")
////    public ModelAndView search(@RequestParam String search, int category,@PageableDefault(value = 5) Pageable pageable) {
////        if (category == 0) {
////            return new ModelAndView("redirect:/");
////        }
////        ModelAndView modelAndView = new ModelAndView("product/list");
////        modelAndView.addObject("list", productService.findBlogByName(category, search,pageable));
////        modelAndView.addObject("listCategory", categoryService.findAll());
////        modelAndView.addObject("category", categoryService.findById(category));
////        return modelAndView;
////    }
}
