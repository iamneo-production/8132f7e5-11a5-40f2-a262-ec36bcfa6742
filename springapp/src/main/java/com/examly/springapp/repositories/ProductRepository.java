package com.examly.springapp.repositories;

import com.examly.springapp.models.ProductModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, String>{
    
}
