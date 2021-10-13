package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.model.OrderModel;
import com.examly.springapp.model.OrderDetailsModel;
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

    @PostMapping("/cart/add")
    public String addToCart(@RequestBody CartModel cart) {
        cartService.addNewCart(cart);
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
    public String deleteCartItem(@RequestBody Long id) {
        if(cartService.checkCartById(id)) {
            cartService.deleteCartById(id);
            return "cart delted";
        }
        return "Invalid request";
    }

    @PostMapping("/saveOrders")
    public String saveProduct(@RequestBody List<Long> cartIdsList) {
        for(Long id: cartIdsList) {
            if(cartService.checkCartById(id)) {
                CartModel tempCart = cartService.getCartById(id);

                OrderModel tempOrder = new OrderModel();
                tempOrder.setUserId(tempCart.getUserId());
                tempOrder.setStatus("Confirmed");
                
                OrderDetailsModel tempOrderDetail = new OrderDetailsModel();
            }
        }
        return "product saved from cart to order.";
    }
}
