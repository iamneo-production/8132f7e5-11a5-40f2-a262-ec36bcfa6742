package com.examly.springapp.controller;

import com.examly.springapp.model.LoginModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class LoginController {

    @PostMapping("/login")
    public Boolean checkUser(LoginModel data) {
        return true;
    }
}
