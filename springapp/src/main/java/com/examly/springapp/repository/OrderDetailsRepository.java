package com.examly.springapp.repository;

import com.examly.springapp.model.OrderDetailsModel;

import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetailsModel, String>{
    
}
