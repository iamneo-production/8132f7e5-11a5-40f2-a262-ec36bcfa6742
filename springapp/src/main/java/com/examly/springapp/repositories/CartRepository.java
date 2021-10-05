package com.examly.springapp.repositories;

import com.examly.springapp.models.CartModel;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartModel, String>{
    
}
