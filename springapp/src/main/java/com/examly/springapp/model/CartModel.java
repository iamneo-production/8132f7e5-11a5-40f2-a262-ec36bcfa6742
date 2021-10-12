package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartModel {
    @Id
    private String cartId;
    private String userId;
    private String productId;
    private String quantity;

    public CartModel() {
        this.cartId = "";
        this.userId = "";
        this.productId = "";
        this.quantity = "";
    }
    public CartModel(String cartId, String userId, String productId, String quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getCartId() {
        return this.cartId;
    }
    public String getUserId() {
        return this.userId;
    }
    public String getProductId() {
        return this.productId;
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
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
}
