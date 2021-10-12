package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.service.CartService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/home/{id}")
    public String addToCart(String quantity, String id) {
        /**
         * 
         * 
         * 
         */
        return "item added to cart.";
    }

    @GetMapping("/cart/{id}")
    public List<CartModel> showCart(String id) {    //cartTempModel
        /**
         * 
         * 
         * 
         */
        return new ArrayList();
    }

    @PostMapping("/cart/delete")
    public String deleteCartItem(String id) {
        /***
         * 
         * 
         * 
         */
        return "cart dleted.";
    }

    @PostMapping("/saveOrders")
    public String saveProduct(String id) {
        /**
         * 
         * 
         * 
         */
        return "product saved from cart to order.";
    }
}
