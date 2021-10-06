package com.examly.springapp.services;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.repositories.OrderRepository;
import com.examly.springapp.models.OrderModel;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    public void addNewProduct(OrderModel order) {
        orderRepository.save(order);
    }

    public boolean findOrderById(String id) {
        return orderRepository.existsById(id);
    }

    public void deleteOrderById(String id) {
        orderRepository.deleteById(id);
    }

    public OrderModel getOrderById(String id) {
        return orderRepository.findById(id).get();
    }

    public List<OrderModel> getAllOrders() {
        List<OrderModel> orders = new ArrayList<>();
        orderRepository.findAll().forEach(orders::add);
        return orders;
    }

}
