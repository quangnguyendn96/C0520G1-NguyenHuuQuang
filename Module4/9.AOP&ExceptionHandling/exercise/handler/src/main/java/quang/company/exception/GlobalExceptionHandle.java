package quang.company.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import quang.company.service.ErrorBadLanguage;

@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(ErrorBadLanguage.class)
    public ModelAndView showErrorPage(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","cấm nói tục đkm");
        return new ModelAndView("redirect:/");
    }
}
