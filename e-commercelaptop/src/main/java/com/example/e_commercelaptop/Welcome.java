package com.example.e_commercelaptop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "Hello Word";
    }
    
}
