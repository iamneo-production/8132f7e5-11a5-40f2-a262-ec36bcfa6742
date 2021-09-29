package com.examly.springapp.controller;

import com.examly.springapp.model.UserModel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class SignupController {
    
    @PostMapping("/signup")
    public Boolean saveUser(UserModel user) {
        return true;
    }
}
