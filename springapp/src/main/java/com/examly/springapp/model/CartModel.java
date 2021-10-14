package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
 
@Entity
public class CartModel {
    @Id @GeneratedValue
    private Long cartId;
    private String userId;
    private Long productId;
    private Integer quantity;

    public CartModel() {}
    
    public CartModel(String userId, Long productId, Integer quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getCartId() {
        return this.cartId;
    }
    public String getUserId() {
        return this.userId;
    }
    public Long getProductId() {
        return this.productId;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
}
