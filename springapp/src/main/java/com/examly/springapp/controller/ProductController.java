package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;
import com.examly.springapp.model.ProductModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProductController {
    
    @GetMapping("/home") 
    public List<ProductModel> getHomeProduct() {
        //product list for user

        List<ProductModel> productList = new ArrayList<ProductModel>();
        productList.add(new ProductModel("String productId", "String imageURL", "String productName", "String price", "String description", "String quantity"));
        return productList;
    }
    
    @GetMapping("/admin")
    public List<ProductModel> getProduct() {
        //product list for admin

        List<ProductModel> productList = new ArrayList<ProductModel>();
        productList.add(new ProductModel("String productId", "String imageURL", "String productName", "String price", "String description", "String quantity"));
        return productList;
    }

    @PostMapping("/admin/addProduct")
    public String productSave(@RequestBody ProductModel data) {
        //add a product to db

        return "new product saved.";
    }
    
    @GetMapping("/admin/delete/{id}")
    public String productDelete(@PathVariable String id) {
        // delete the product with id - id
        return "deleted";
    }

    @GetMapping("/admin/productEdit/{id}")
    public ProductModel productEditData(@PathVariable String id) {
        // get the product details with id - id
        return new ProductModel();
    }

    @PostMapping("/admin/productEdit/{id}")
    public String productEditSave(@RequestBody ProductModel data, @PathVariable String id) {
        // save the product with id - id
        return "existing product edit saved.";
    }

}
