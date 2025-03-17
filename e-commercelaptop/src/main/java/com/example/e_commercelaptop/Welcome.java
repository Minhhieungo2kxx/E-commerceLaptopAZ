package com.example.e_commercelaptop;

import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@Transactional
@PropertySource("classpath:application.properties")
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Spring MVC";
    }
    @GetMapping("/user")
    public String getUser() {
        return "Only User Can Access";
    }
    @GetMapping("/admin")
    public String getAdmin() {
        return "OnlyC Admin Can Access";
    }
   
    
    
    
    
    
    
    
}
