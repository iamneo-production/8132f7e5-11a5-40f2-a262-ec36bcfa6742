package com.examly.springapp.controller;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.model.UserModel;
import com.examly.springapp.service.UserService;

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
