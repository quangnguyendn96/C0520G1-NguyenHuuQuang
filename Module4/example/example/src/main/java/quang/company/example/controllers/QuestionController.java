package quang.company.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.example.model.Question;
import quang.company.example.model.QuestionType;
import quang.company.example.service.QuestionService;
import quang.company.example.service.QuestionTypeService;

import java.util.List;

@Controller
@RequestMapping("/")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @Autowired
    QuestionTypeService questionTypeService;

    //    @ModelAttribute("list")
//    public Page<Product> getList (Pageable pageable) {
//        return productService.findAllByStatusProductTrue(pageable);
//    }
    @ModelAttribute("listQuestion")
    public List<QuestionType> getListCategory() {
        return questionTypeService.findAll();
    }


    @GetMapping
    public ModelAndView showAll(@PageableDefault(value = 5) Pageable pageable) {
//    public ModelAndView showAll(@PageableDefault(value = 5) @SortDefault(sort = {"nameProduct"}, direction = Sort.Direction.DESC)Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("question/list");

        modelAndView.addObject("question", new Question());

        modelAndView.addObject("list", questionService.findAll());
        return modelAndView;
    }


    @GetMapping("/createNewPage")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("question/create");
        modelAndView.addObject("question", new Question());
        return modelAndView;
    }
}
//    @PostMapping("/create")
//    public ModelAndView create(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult, RedirectAttributes redirect,@PageableDefault(value = 5) Pageable pageable) {
//        new Product().validate(product, bindingResult);
//        if (bindingResult.hasErrors()) {
//            ModelAndView modelAndView = new ModelAndView("product/list");
//
//            modelAndView.addObject("productEdit",new Product());
//            modelAndView.addObject("list", productService.findAllByStatusProductTrue(pageable));
//            return modelAndView;
//
//        } else {
//            ModelAndView modelAndView = new ModelAndView("redirect:/");
//            product.setStatusProduct(true);
//            productService.add(product);
//            redirect.addFlashAttribute("messageProduct", "Create Succession");
//            return modelAndView;
//        }
//    }

//    @PostMapping("/createNewPage")
//    public ModelAndView createNewPage(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult, RedirectAttributes redirect) {
//        new Product().validate(product, bindingResult);
//        if (bindingResult.hasErrors()) {
//            ModelAndView modelAndView = new ModelAndView("product/create");
//            return modelAndView;
//
//        } else {
//            ModelAndView modelAndView = new ModelAndView("redirect:/");
//            product.setStatusProduct(true);
//            productService.add(product);
//            redirect.addFlashAttribute("messageProduct", "Create Succession");
//            return modelAndView;
//        }
//    }

//edit
//    @GetMapping("/edit/{id}")
//    public ModelAndView showEdit(@PathVariable Long id) {
//        ModelAndView modelAndView = new ModelAndView("product/list");
//        modelAndView.addObject("product", productService.findById(id));
//        return modelAndView;
//    }

//    @PostMapping("/edit")
//    public String edit(@Validated @ModelAttribute("productEdit") Product product, BindingResult bindingResult, RedirectAttributes redirect, Model model,@PageableDefault(value = 5) Pageable pageable) {
////        new Product().validate(product, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
////            model.addAttribute("option", 1);
//            model.addAttribute("product",new Product());
//            model.addAttribute("list", productService.findAllByStatusProductTrue(pageable));
//            return ("product/list");
//        } else {
//            product.setStatusProduct(true);
//            productService.add(product);
//            redirect.addFlashAttribute("messageProduct", "Edit Succession");
//            return "redirect:/";
//        }
//    }

//    @GetMapping("/deleteSelect")
//    public ModelAndView deleteSelect(@RequestParam Long[] select, RedirectAttributes redirect) {
//        ModelAndView modelAndView = new ModelAndView("redirect:/");
//        List<Long> listDelete = new ArrayList<>(Arrays.asList(select));
//        redirect.addFlashAttribute("messageProduct", "Delete Succession");
//        modelAndView.addObject("listSelect", listDelete);
//        productService.deleteByCheckBox(listDelete);
//        return modelAndView;
//    }

//    @GetMapping("/searchByCategory")
//    public ModelAndView searchByCategory(@RequestParam String search, int category, @PageableDefault(value = 5) Pageable pageable) {
//        if (category == 0) {
//            return new ModelAndView("redirect:/");
//        }
//        ModelAndView modelAndView = new ModelAndView("product/list");
//        modelAndView.addObject("list", productService.findBlogByName(category, search, pageable));
//        modelAndView.addObject("product", new Product());
//        modelAndView.addObject("searchCate", search);
//        modelAndView.addObject("category", category);
//        return modelAndView;
//    }
//
//    @GetMapping("/search")
//    public ModelAndView search(@RequestParam int searchField, String search, @PageableDefault(value = 5) Pageable pageable) {
//
//        ModelAndView modelAndView = new ModelAndView("product/list");
//        switch (searchField){
//            case 0 :
//                modelAndView.addObject("list", productService.findByAllField(search,pageable));
//                break;
//            case 1:
//                modelAndView.addObject("list",productService.findAllByIdProductContaining(search,pageable));
//                break;
//            case 2:
//                modelAndView.addObject("list",productService.findAllByNameProductContaining(search,pageable));
//                break;
//            case 3:
//                modelAndView.addObject("list",productService.findAllByPriceProductContaining(Double.parseDouble(search),pageable));
//                break;
//            case 4:
//                modelAndView.addObject("list",productService.findAllByCategoryContaining(search,pageable));
//                break;
//            case 5:
//                modelAndView.addObject("list",productService.findAllByDateImport(search,pageable));
//                break;
//            case 6:
//                modelAndView.addObject("list",productService.findAllByDateExport(search,pageable));
//                break;
//        }
//        modelAndView.addObject("searchValue", search);
//        modelAndView.addObject("searchField", searchField);
//        modelAndView.addObject("product", new Product());
//        return modelAndView;
//    }
//
//    @GetMapping("/detail/{id}")
//    public ModelAndView showDetailPage(@PathVariable long id) {
//
//        ModelAndView modelAndView = new ModelAndView("product/detail");
//        modelAndView.addObject("product", productService.findById(id));
//        return modelAndView;
//    }
//}

//    }

//    @GetMapping("/delete/{id}")
//    public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes redirect) {
//        ModelAndView modelAndView = new ModelAndView(("redirect:/"));
//        redirect.addFlashAttribute("messageProduct", "Delete Succession");
//        productService.delete(id);
//        return modelAndView;
//    }