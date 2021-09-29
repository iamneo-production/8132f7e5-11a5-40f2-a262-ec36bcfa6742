package com.examly.springapp.model;

import org.springframework.stereotype.Service;

@Service
public class OrderModel {
    private String orderId;
    private String userId;
    private String productName;
    private int quantity;
    private String totalPrice;
    private String status;
    private String price;
    
    OrderModel() {
        this.orderId = "";
        this.userId = "";
        this.productName = "";
        this.quantity = 0;
        this.totalPrice = "";
        this.status = "";
        this.price = "";
    }
    OrderModel(String orderId, String userId, String productName, int quantity, String totalPrice, String status, String price) {
        this.orderId = orderId;
        this.userId = "";
        this.productName = "";
        this.quantity = 0;
        this.totalPrice = "";
        this.status = "";
        this.price = "";
    }

    public String getOrderId() {
        return this.orderId;
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
    public String getTotalPrice() {
        return this.totalPrice;
    }
    public String getStatus() {
        return this.status;
    }
    public String getPrice() {
        return this.price;
    }
    
    public setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public setUserId(String userId) {
       this.userId = userId;
    }
    public setProductName(String productName) {
        this.productName = productName;
    }
    public setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    public setStatus(String status) {
        this.status = status;
    }
    public setPrice(String price) {
        this.price = price;
    }
    
}
