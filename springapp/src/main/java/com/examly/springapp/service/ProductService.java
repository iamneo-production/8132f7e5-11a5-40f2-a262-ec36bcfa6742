package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.repository.ProductRepository;
import com.examly.springapp.model.ProductModel;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public void addNewProduct(ProductModel product) {
        productRepository.save(product);
    }

    public boolean checkProductById(String id) {
        return productRepository.existsById(id);
    }

    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }

    public ProductModel getProductById(String id) {
        return productRepository.findById(id).get();
    }

    public List<ProductModel> getAllProducts() {
        List<ProductModel> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }
}
