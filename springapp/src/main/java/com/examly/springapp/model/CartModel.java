package com.examly.springapp.model;

import org.springframework.stereotype.Service;

@Service
public class CartModel {
    private String cartId;
    private String userId;
    private String productName;
    private String quantity;
    private String price;

    public CartModel() {
        this.cartId = "";
        this.userId = "";
        this.productName = "";
        this.quantity = "";
        this.price = "";
    }
    public CartModel(String cartId, String userId, String productName, String quantity, String price) {
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
    public String getQuantity() {
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
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    
}
