package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class OrderDetailsModel {
    @Id
    private String id;
    private String orderId;
    private String productId;
    private String quantity;
    
    public OrderDetailsModel() {
        this.orderId = "";
        this.productId = "";
        this.quantity = "";
    }
    public OrderDetailsModel(String orderId, String productId, String quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return this.orderId;
    }
    public String getProductId() {
        return this.productId;
    }
    public String getQuantity() {
        return this.quantity;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
