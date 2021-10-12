package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.repository.OrderDetailsRepository;
import com.examly.springapp.model.OrderDetailsModel;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
    
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    
    public void addNewOrder(OrderDetailsModel data) {
        orderDetailsRepository.save(data);
    }

    public boolean findOrderById(String id) {
        return orderDetailsRepository.existsById(id);
    }

    public void deleteOrderById(String id) {
        orderDetailsRepository.deleteById(id);
    }

    public OrderDetailsModel getOrderById(String id) {
        return orderDetailsRepository.findById(id).get();
    }

    public List<OrderDetailsModel> getAllOrders() {
        List<OrderDetailsModel> orders = new ArrayList<>();
        orderDetailsRepository.findAll().forEach(orders::add);
        return orders;
    }

}
