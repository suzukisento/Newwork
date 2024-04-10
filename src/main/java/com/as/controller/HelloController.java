package com.as.controller;

import com.as.domain.User;
import com.as.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User queryeUser(@PathVariable Long id){
        System.out.println(userService.queryById(id));

        System.out.println("我好啊");
        return userService.queryById(id);
    }
}
