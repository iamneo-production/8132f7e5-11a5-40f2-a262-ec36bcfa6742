package com.examly.springapp.controllers;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.models.CartModel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CartController {
    @PostMapping("/home/{id}")
    public String addToCart(String quantity, String id) {
        return "item added to cart.";
    }

    @GetMapping("/cart/{id}")
    public List<CartModel> showCart(String id) {    //cartTempModel
        return new ArrayList();
    }

    @PostMapping("/cart/delete")
    public String deleteCartItem(String id) {
        return "cart dleted.";
    }

    @PostMapping("/saveOrders")
    public String saveProduct(String id) {
        return "product saved from cart to order.";
    }
}
