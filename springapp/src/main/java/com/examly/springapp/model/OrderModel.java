package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class OrderModel {
    @Id @GeneratedValue
    private Long orderId;
    private String userId;
    private String status;
    
    public OrderModel() {
        this.userId = "";
        this.status = "";
    }
    public OrderModel(String userId, String status) {
        this.userId = userId;
        this.status = status;
    }

    public Long getOrderId() {
        return this.orderId;
    }
    public String getUserId() {
        return this.userId;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public void setUserId(String userId) {
       this.userId = userId;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
