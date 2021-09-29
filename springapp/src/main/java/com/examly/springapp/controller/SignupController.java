package com.examly.springapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class SignupController {
    
    @PostMapping
    public void saveUser(UserModel user) {
        
    }
}
