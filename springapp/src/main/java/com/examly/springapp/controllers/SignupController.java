package com.examly.springapp.controllers;

import com.examly.springapp.models.UserModel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SignupController {
        
    @PostMapping("/signup")
    public Boolean saveUser(@RequestBody UserModel user) {
        return true;
    }
}
