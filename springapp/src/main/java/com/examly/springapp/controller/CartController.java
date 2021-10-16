package com.examly.springapp.controller;

import java.util.List;
import java.util.ArrayList;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.model.ProductModel;
import com.examly.springapp.model.UserModel;
import com.examly.springapp.model.OrderModel;
import com.examly.springapp.model.OrderDetailsModel;
import com.examly.springapp.service.CartService;
import com.examly.springapp.service.OrderService;
import com.examly.springapp.service.UserService;
import com.examly.springapp.service.ProductService;
import com.examly.springapp.service.OrderDetailsService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CartController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService orderService;
    
    @Autowired
    private OrderDetailsService orderDetailsService;

    @PostMapping("/cart/add")
    public String addToCart(@RequestBody CartModel cart) {
        if(!userService.checkUserById(cart.getUserId()) || cart.getQuantity() < 0 || !productService.checkProductById(cart.getProductId())) {
            return "Invalid request";
        }
        cartService.addNewCart(cart);
        return "item added to cart.";
    }

    @GetMapping("/cart/{userId}")
    public List<CartModel> showCart(@PathVariable String userId) {
        if(!userService.checkUserById(userId)) {
            return new ArrayList<CartModel>();
        }
        return cartService.getCartsByUserId(userId);
    }

    @PostMapping("/cart/delete")
    public String deleteCartItem(@RequestBody Long id) {
        if(cartService.checkCartById(id)) {
            cartService.deleteCartById(id);
            return "cart delted";
        }
        return "Invalid request";
    }

    @PostMapping("/saveOrders")
    public String saveProduct(@RequestBody List<Long> cartIdsList) {
        if(cartIdsList.isEmpty()) {
            return "Invalid Request.";
        }

        String userId = "";
        if(cartService.checkCartById(cartIdsList.get(0))) {
            CartModel cart = cartService.getCartById(cartIdsList.get(0));
            userId = cart.getUserId();
        } else {
            return "Invalid request";
        }

        OrderModel order = new OrderModel(userId, "processing");
        orderService.addNewOrder(order);
        List<OrderModel> orders = new ArrayList<OrderModel>(orderService.getOrdersByUserId(userId));
        order = orders.get(orders.size() - 1);

        for(Long cartId: cartIdsList) {
            if(cartService.checkCartById(cartId)) {
                CartModel cart = cartService.getCartById(cartId);
                if(productService.checkProductById(cart.getProductId())) {
                    ProductModel product = productService.getProductById(cart.getProductId());
                    if(cart.getQuantity() > product.getQuantity()) {
                        return "that much quantity is not available";
                    } else {
                        product.setQuantity(product.getQuantity()-cart.getQuantity());
                        productService.updateProductById(product.getProductId(), product);
                    }

                    OrderDetailsModel orderDetails = new OrderDetailsModel(order.getOrderId(), product.getProductId(), cart.getQuantity());
                    orderDetailsService.addNewOrderDetails(orderDetails);
                }
            }
        }
        
        order.setStatus("ordered");
        orderService.updateOrderById(order.getOrderId(), order);
        
        return "product saved from cart to order.";
    }
}
