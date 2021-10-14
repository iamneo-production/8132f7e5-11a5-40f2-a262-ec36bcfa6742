package com.examly.springapp.model;
import com.examly.springapp.model.OrderDetailsCompositeKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
 
@Entity
@IdClass(OrderDetailsCompositeKey.class)
public class OrderDetailsModel {
    @Id
    private Long orderId;
    @Id
    private Long productId;
    private Integer quantity;
    
    public OrderDetailsModel() {}

    public OrderDetailsModel(Long orderId, Long productId, Integer quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getOrderId() {
        return this.orderId;
    }
    public Long getProductId() {
        return this.productId;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
