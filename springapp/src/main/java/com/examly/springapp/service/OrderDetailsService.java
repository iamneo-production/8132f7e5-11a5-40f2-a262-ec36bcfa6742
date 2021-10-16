package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.repository.OrderDetailsRepository;
import com.examly.springapp.model.OrderDetailsModel;
import com.examly.springapp.model.OrderDetailsCompositeKey;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderDetailsService {
    
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    
    public void addNewOrderDetails(OrderDetailsModel data) {
        orderDetailsRepository.save(data);
    }

    public boolean checkOrderDetailsById(String id) {
        return true; //orderDetailsRepository.existsById(id);
    }

    /*
    public void deleteOrderDetailsById(String id) {
       // orderDetailsRepository.deleteById(id);
    }*/

    public OrderDetailsModel getOrderDetailsById(String id) {
        return new OrderDetailsModel();//orderDetailsRepository.findById(id).get();
    }

    public List<OrderDetailsModel> getAllOrderDetails() {
        List<OrderDetailsModel> orders = new ArrayList<>();
        orderDetailsRepository.findAll().forEach(orders::add);
        return orders;
    }

}
