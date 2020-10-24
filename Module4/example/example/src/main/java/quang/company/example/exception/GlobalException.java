package quang.company.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
    public ModelAndView errorInput() {
        return null;
    }
}
