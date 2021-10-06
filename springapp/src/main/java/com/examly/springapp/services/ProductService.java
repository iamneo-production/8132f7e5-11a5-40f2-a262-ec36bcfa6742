package com.examly.springapp.services;

import com.examly.springapp.repositories.ProductRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

}
