package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartModel {
    @Id
    private String cartId;
    private String userId;
    private String productName;
    private String quantity;

    public CartModel() {
        this.cartId = "";
        this.userId = "";
        this.productName = "";
        this.quantity = "";
    }
    public CartModel(String cartId, String userId, String productName, String quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
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
    
}
