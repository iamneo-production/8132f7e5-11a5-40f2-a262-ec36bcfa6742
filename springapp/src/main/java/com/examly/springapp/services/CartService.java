package com.examly.springapp.services;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.repositories.CartRepository;
import com.examly.springapp.models.CartModel;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CartService {
    
    @Autowired
    private CartRepository cartRepository;

    public void addNewCart(CartModel cart) {
        cartRepository.save(cart);
    }

    public boolean findCartById(String id) {
        return cartRepository.existsById(id);
    }

    public void deleteCartById(String id) {
        cartRepository.deleteById(id);
    }

    public CartModel getCartById(String id) {
        return cartRepository.findById(id).get();
    }

    public List<CartModel> getAllCarts() {
        List<CartModel> carts = new ArrayList<>();
        cartRepository.findAll().forEach(carts::add);
        return carts;
    }
}
