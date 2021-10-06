package com.examly.springapp.controllers;

import com.examly.springapp.models.UserModel;
import com.examly.springapp.services.UserService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class SignupController {

    @Autowired
    private UserService userService;
        
    @PostMapping("/signup")
    public Boolean saveUser(@RequestBody UserModel user) {
        if(user.isNull()){
            return false;
        }
        userService.addNewUser(user);
        return true;
    }
}
