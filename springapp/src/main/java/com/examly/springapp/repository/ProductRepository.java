package com.examly.springapp.repository;

import com.examly.springapp.model.ProductModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends CrudRepository<ProductModel, Long>{
    @Modifying
    @Query("update ProductModel p set p = data where p.id = id")
    void updateProductById(Long id, ProductModel data);
}

