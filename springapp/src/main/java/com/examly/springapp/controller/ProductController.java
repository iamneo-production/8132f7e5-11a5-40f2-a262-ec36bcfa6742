package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.model.ProductModel;
import com.examly.springapp.service.ProductService;

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
    public String productDelete(@PathVariable Long id) {
        // delete the product with id - id
        if(productService.checkProductById(id)) {
            productService.deleteProductById(id);
            return "Deleted";
        }
        return "Invalid request";
    }

    @GetMapping("/admin/productEdit/{id}")
    public ProductModel productEditData(@PathVariable Long id) {
        // get the product details with id - id
        if(productService.checkProductById(id)) {
            return productService.getProductById(id);
        }
        return new ProductModel();
    }

    @PostMapping("/admin/productEdit/{id}")
    public String productEditSave(@RequestBody ProductModel data, @PathVariable Long id) {
        // save the product with id - id
        if(productService.checkProductById(id)) {
            productService.updateProductById(id, data);
            return "existing product updated.";
        }
        return "Invalid request";
    }

}
