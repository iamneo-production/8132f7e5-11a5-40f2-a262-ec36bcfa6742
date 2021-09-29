package com.examly.springapp.controller;

import com.examly.springapp.model.ProductModel;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProductController {

    @GetMapping("/admin")
    public List<ProductModel> getProduct() {
        List<ProductModel> productList = new ArrayList<ProductModel>();
        productList.add(new ProductModel("String productId", "String imageURL", "String productName", "String price", "String description", "String quantity"));
        return productList;
    }

    @GetMapping("/home")
    public List<ProductModel> getHomeProduct() {
        List<ProductModel> productList = new ArrayList<ProductModel>();
        productList.add(new ProductModel("String productId", "String imageURL", "String productName", "String price", "String description", "String quantity"));
        return productList;
    }

    @GetMapping("/admin/productEdit/{id}")
    public ProductModel productEditData(@PathVariable String id) {
        return new ProductModel();
    }

    @PostMapping("/admin/productEdit/{id}")
    public String productEditSave(@RequestBody ProductModel data, @PathVariable String id) {
        return "existing product edit saved.";
    }

    @PostMapping("/admin/addProduct")
    public String productSave(@RequestBody ProductModel data) {
        return "new product saved.";
    }

    @GetMapping("/admin/delete/{id}")
    public String productDelete(@PathVariable String id) {
        return "deleted";
    }
}
