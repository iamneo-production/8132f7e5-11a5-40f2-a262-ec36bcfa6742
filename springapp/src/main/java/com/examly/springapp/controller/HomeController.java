package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "<h1>Med-Care</h1>";
    }
}
