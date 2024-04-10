package com.as.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello2Controller {
    @GetMapping("index")
    public String hello2(){
        return "index";
    }
}
