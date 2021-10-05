package com.examly.springapp.repositories;

import com.examly.springapp.models.OrderModel;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderModel, String>{
    
}
