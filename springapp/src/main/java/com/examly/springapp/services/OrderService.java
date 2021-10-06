package com.examly.springapp.services;

import com.examly.springapp.repositories.OrderRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
}
