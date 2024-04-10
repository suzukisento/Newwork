package com.as.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class MyErrorHandler {
    /*@ExceptionHandler(RuntimeException.class)
    @ResponseStatus
    public ModelAndView processException(RuntimeException re) {
        System.out.println("自定义异常处理 -> RuntimeException!");
        ModelAndView mav = new ModelAndView();
        mav.addObject("myException", re.getMessage());
        mav.setViewName("error/500");
        return mav;
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus
    public String processException(Exception e, Model model) {
        System.out.println("自定义异常处理 -> Exception!");
        model.addAttribute("myException", e.getMessage());
        return "error/500";
    }*/
}
