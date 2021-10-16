package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.model.UserModel;
import com.examly.springapp.model.ProductModel;
import com.examly.springapp.model.OrderModel;
import com.examly.springapp.model.OrderDetailsModel;
import com.examly.springapp.service.OrderService;
import com.examly.springapp.service.UserService;
import com.examly.springapp.service.ProductService;
import com.examly.springapp.service.OrderDetailsService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class OrderController {
    
    @Autowired
    private OrderService orderService; 
    @Autowired
    private OrderDetailsService orderDetailsService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @GetMapping("/orders")
    public List<OrderModel> getOrders(@RequestHeader String userId) {
        if(userService.checkUserById(userId)){
            return orderService.getOrdersByUserId(userId);
        }
        return new ArrayList<OrderModel>();
    }

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody String userId, @RequestBody Long productId, @RequestBody Integer quantity) {
        if(!userService.checkUserById(userId) || !productService.checkProductById(productId)) {
            return "Invalid request.";
        }

        ProductModel product = productService.getProductById(productId);
        if(quantity > product.getQuantity()) {
            return "that much quantity is not available";
        } else {
            product.setQuantity(product.getQuantity()-quantity);
            productService.updateProductById(product.getProductId(), product);
        }

        OrderModel order = new OrderModel(userId, "processing");
        orderService.addNewOrder(order);
        List<OrderModel> orders = new ArrayList<OrderModel>(orderService.getOrdersByUserId(userId));
        order = orders.get(orders.size() - 1);

        OrderDetailsModel orderDetails = new OrderDetailsModel(order.getOrderId(), product.getProductId(), quantity);
        orderDetailsService.addNewOrderDetails(orderDetails);

        order.setStatus("ordered");
        orderService.updateOrderById(order.getOrderId(), order);
        return "Order Placed";
    }

    @GetMapping("/admin/orders")
    public List<OrderModel> getUserOrders() {
        return orderService.getAllOrders();
    }
}
