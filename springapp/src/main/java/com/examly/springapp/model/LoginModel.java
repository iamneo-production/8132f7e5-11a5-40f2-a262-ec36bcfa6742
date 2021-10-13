package com.examly.springapp.model;

import org.springframework.stereotype.Component;
 
@Component
public class LoginModel {
    private String email;
    private String password;

    public LoginModel() {
        this.email = "";
        this.password = "";
    }
    public LoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
