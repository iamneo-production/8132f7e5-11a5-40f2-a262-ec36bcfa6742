package com.examly.springapp.model;

import org.springframework.stereotype.Service;

@Service
public class ProductModel {
    private String productId;
    private String imageURL;
    private String productName;
    private String price;
    private String description;
    private String quantity;

    ProductModel() {
        this.productId = "";
        this.imageURL = "";
        this.productName = "";
        this.price = "";
        this.description = "";
        this.quantity = "";
    }
    ProductModel(String productId, String imageURL, String productName, String price, String description, String quantity) {
        this.productId = productId;
        this.imageURL = imageURL;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getProductId() {
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
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
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