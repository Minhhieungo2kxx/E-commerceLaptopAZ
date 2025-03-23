package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    public String getHome() {
        return "Welcome to Home";
    }
}
