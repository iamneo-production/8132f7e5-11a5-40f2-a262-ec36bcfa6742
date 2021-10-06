package com.examly.springapp.services;

import com.examly.springapp.repositories.CartRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CartService {
    
    @Autowired
    private CartRepository cartRepository;
}
