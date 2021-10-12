package com.examly.springapp.repository;

import com.examly.springapp.model.ProductModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, String>{
    
}
