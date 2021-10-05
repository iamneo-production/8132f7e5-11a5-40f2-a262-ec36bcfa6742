package com.examly.springapp.controllers;

import com.examly.springapp.models.LoginModel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class LoginController {

    @PostMapping("/login")
    public Boolean checkUser(LoginModel data) {
        return true;
    }
}
