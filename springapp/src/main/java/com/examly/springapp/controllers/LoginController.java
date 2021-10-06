package com.examly.springapp.controllers;

import com.examly.springapp.models.LoginModel;
import com.examly.springapp.models.UserModel;
import com.examly.springapp.services.UserService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;
       
    @PostMapping("/login")
    public Boolean checkUser(LoginModel data) {
        return userService.findUserById(data.getEmail());
    }
}
