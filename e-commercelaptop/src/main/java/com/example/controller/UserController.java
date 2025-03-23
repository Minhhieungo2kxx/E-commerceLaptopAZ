package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.service.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String getHome() {
        return userService.getHome();
    }
}