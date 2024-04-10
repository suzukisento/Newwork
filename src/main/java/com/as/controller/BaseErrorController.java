package com.as.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("error")
public class BaseErrorController implements ErrorController {

    public String getErrorPath(){
        System.out.println("不好意思，出错了");
        return "error/error";
    }
    @RequestMapping
    public String error(){
        return getErrorPath();
    }

}
