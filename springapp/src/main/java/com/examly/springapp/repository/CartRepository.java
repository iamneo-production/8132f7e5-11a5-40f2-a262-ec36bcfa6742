package com.examly.springapp.repository;

import com.examly.springapp.model.CartModel;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartModel, String>{
    
}
