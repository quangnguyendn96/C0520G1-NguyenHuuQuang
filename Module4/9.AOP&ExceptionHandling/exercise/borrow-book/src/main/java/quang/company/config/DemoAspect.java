package quang.company.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class DemoAspect {
    @Pointcut("execution(* quang.company.controllers.BookController.getBorrowBook(..))")
    public void bookControllerMethod(){}

    @Before("bookControllerMethod()")
    public void beforeCallMethod(JoinPoint joinPoint){
        System.err.println("Start method name: "+joinPoint.getSignature().getName() + " Time: "+ LocalDateTime.now());
    }

    @After("bookControllerMethod()")
    public void afterCallMethod(JoinPoint joinPoint){
        System.err.println("End method name: "+joinPoint.getSignature().getName() + " Time: "+ LocalDateTime.now());
    }
}
