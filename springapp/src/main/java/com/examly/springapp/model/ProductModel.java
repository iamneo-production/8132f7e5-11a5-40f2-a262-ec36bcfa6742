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
    private String price;
    private String description;
    private String quantity;

    public ProductModel() {
        this.imageURL = "";
        this.productName = "";
        this.price = "";
        this.description = "";
        this.quantity = "";
    }
    public ProductModel(String imageURL, String productName, String price, String description, String quantity) {
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
    public String getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public String getQuantity() {
        return this.quantity;
    }
    
    /*public void setProductId(String productId) {
        this.productId = productId;
    }*/
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
