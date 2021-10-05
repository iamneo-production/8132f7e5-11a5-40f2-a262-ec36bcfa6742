package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderModel {
    @Id
    private String orderId;
    private String userId;
    private String productId;
    private String quantity;
    private String status;
    
    public OrderModel() {
        this.orderId = "";
        this.userId = "";
        this.productId = "";
        this.quantity = "";
        this.status = "";
    }
    public OrderModel(String orderId, String userId, String productId, String quantity, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }

    public String getOrderId() {
        return this.orderId;
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
    public String getStatus() {
        return this.status;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
    public void setStatus(String status) {
        this.status = status;
    }
}
