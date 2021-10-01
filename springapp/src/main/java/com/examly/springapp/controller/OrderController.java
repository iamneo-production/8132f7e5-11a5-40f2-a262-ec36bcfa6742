package com.examly.springapp.controller;

import com.examly.springapp.model.OrderModel;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class OrderController {
    
    @PostMapping("/orders")
    public List<OrderModel> getOrders(@RequestBody String id) {
        return new ArrayList<OrderModel>();
    }

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody OrderModel order) {
        return "Order Placed";
    }

    @GetMapping("/admin/orders")
    public List<OrderModel> getUserProducts(/*String id*/) {
        return new ArrayList<OrderModel>();
    }
}
