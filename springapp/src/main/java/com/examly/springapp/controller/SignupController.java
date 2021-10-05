package com.examly.springapp.controller;

import com.examly.springapp.model.UserModel;
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
