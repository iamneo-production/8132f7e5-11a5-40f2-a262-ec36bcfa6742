package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.model.OrderModel;
import com.examly.springapp.service.OrderService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public List<OrderModel> getOrders(@RequestBody String id) {
        List<OrderModel> orderList = new ArrayList<>();
        orderList.add(orderService.getOrderById(id));
        return orderList;
    }

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody OrderModel order) {
        orderService.addNewOrder(order);
        return "Order Placed";
    }

    @GetMapping("/admin/orders")
    public List<OrderModel> getUserProducts(/*String id*/) {
        /**
         * 
         * 
         * 
         * 
         * 
         */
        return new ArrayList<OrderModel>();
    }
}