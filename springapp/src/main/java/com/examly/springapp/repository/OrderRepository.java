package com.examly.springapp.repository;

import com.examly.springapp.model.OrderModel;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderModel, Long>{
    
}
