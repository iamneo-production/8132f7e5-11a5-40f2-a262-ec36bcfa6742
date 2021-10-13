package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class OrderModel {
    @Id
    private String orderId;
    private String userId;
    private String status;
    
    public OrderModel() {
        this.orderId = "";
        this.userId = "";
        this.status = "";
    }
    public OrderModel(String orderId, String userId, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.status = status;
    }

    public String getOrderId() {
        return this.orderId;
    }
    public String getUserId() {
        return this.userId;
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
    public void setStatus(String status) {
        this.status = status;
    }
}
