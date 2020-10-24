package controllers;

import bo.DictionaryBO;
import bo.iml.DictionaryIml;
import dao.DictionaryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DictionaryController {
    @Autowired
   private DictionaryBO dictionaryBO;
//    DictionaryBO dictionaryBO = new DictionaryBO();

    @GetMapping(value = "/")
    public ModelAndView getDictionary(HttpServletRequest request) {
        String word = request.getParameter("dictionary");
        if (word == null) {
            return new ModelAndView("dictionary", "word", "");
        }
        return new ModelAndView("dictionary", "word", dictionaryBO.searchWord(word));
    }
}

