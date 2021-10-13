package com.examly.springapp.repository;

import com.examly.springapp.model.OrderDetailsModel;
import com.examly.springapp.model.OrderDetailsCompositeKey;

import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetailsModel, OrderDetailsCompositeKey>{
    
}
