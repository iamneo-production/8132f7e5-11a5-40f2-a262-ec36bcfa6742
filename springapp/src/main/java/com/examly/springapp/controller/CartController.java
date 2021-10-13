package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.service.CartService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
         */
        return "item added to cart.";
    }

    @GetMapping("/cart/{userId}")
    public List<CartModel> showCart(@PathVariable String userId) {
        /**
         * 
         * cart filter by usr id
         * 
         */
        return new ArrayList();
    }

    @PostMapping("/cart/delete")
    public String deleteCartItem(@RequestBody String id) {
        if(cartService.checkCartById(id)) {
            cartService.deleteCartById(id);
            return "cart delted";
        }
        return "Invalid request";
    }

    @PostMapping("/saveOrders")
    public String saveProduct(@RequestBody List<String> cartIdsList) {
        /**
         * list of cart id
         * 
         * 
         * 
         */
        return "product saved from cart to order.";
    }
}
