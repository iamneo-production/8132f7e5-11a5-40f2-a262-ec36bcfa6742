package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
 
@Entity
public class ProductModel {
    @Id @GeneratedValue
    private Long productId;
    private String imageURL;
    private String productName;
    private Float price;
    private String description;
    private Integer quantity;

    public ProductModel() {}
    
    public ProductModel(String imageURL, String productName, Float price, String description, Integer quantity) {
        this.imageURL = imageURL;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return this.productId;
    }
    public String getImageURL() {
        return this.imageURL;
    }
    public String getProductName() {
        return this.productName;
    }
    public Float getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isValid() {
        if( this.imageURL == "" || this.productName == "" || this.price < 0 || this.description == "" || this.quantity < 0) {
            return false;
        }
        return true;
    }
}
