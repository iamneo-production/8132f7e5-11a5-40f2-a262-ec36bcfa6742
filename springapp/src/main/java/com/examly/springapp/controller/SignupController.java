package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class SignupController {
    
    @PostMapping("/signin")
    public Boolean saveUser(UserModel user) {
        return true;
    }
}
