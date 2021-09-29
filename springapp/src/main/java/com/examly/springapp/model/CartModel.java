package com.examly.springapp.model;

import org.springframework.stereotype.Service;

@Service
public class CartModel {
    private String cartId;
    private String userId;
    private String productName;
    private int quantity;
    private String price;

    CartModel() {
        this.cartId = "";
        this.userId = "";
        this.productName = "";
        this.quantity = 0;
        this.price = "";
    }
    CartModel(String cartId, String userId, String productName, int quantity, String price) {
        this.cartId = cartId;
        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCartId() {
        return this.cartId;
    }
    public String getUserId() {
        return this.userId;
    }
    public String getProductName() {
        return this.productName;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public String getPrice() {
        return this.price;
    }
    
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    
}
