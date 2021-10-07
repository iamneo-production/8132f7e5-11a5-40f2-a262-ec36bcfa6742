package com.examly.springapp.controllers;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.models.ProductModel;
import com.examly.springapp.services.ProductService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("/home") 
    public List<ProductModel> getHomeProduct() {
        //product list for user
        List<ProductModel> productList = productService.getAllProducts();
        return productList;
    }
    
    @GetMapping("/admin")
    public List<ProductModel> getProduct() {
        //product list for admin
        List<ProductModel> productList = productService.getAllProducts();
        return productList;
    }

    @PostMapping("/admin/addProduct")
    public String productSave(@RequestBody ProductModel data) {
        //add a product to db
        productService.addNewProduct(data);
        return "new product saved.";
    }
    
    @GetMapping("/admin/delete/{id}")
    public String productDelete(@PathVariable String id) {
        // delete the product with id - id
        productService.deleteProductById(id);
        return "deleted";
    }

    @GetMapping("/admin/productEdit/{id}")
    public ProductModel productEditData(@PathVariable String id) {
        // get the product details with id - id
        return productService.getProductById(id);
    }

    @PostMapping("/admin/productEdit/{id}")
    public String productEditSave(@RequestBody ProductModel data, @PathVariable String id) {
        // save the product with id - id
        /**
         * 
         * 
         * 
         */
        return "existing product edit saved.";
    }

}
