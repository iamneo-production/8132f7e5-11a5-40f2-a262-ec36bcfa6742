
package com.examly.springapp.model;

import org.springframework.stereotype.Service;

@Service
public class UserModel {
    private String email;
    private String password;
    private String userName;
    private String mobileNumber;
    private Boolean active;
    private String role;
    //private CartModel cart;
    //private List<OrderModel> orderList;

    UserModel() {
        this.email = "";
        this.password = "";
        this.userName = "";
        this.mobileNumber = "";
        this.active = false;
        this.role = "";
        //this.cart = new CartModel();
        //this.orderList = new List<OrderModel>();
    }
    
    UserModel(String email, String password, String userName, String mobileNumber, Boolean active, String role) {
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.active = active;
        this.role = role;
        //this.cart = cart;
        //this.orderList = orderList;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public String getUserName() {
        return this.userName;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    public Boolean getActive() {
        return this.active;
    }
    public String getRole() {
        return this.role;
    }
    /*
        cart()
        orderList()
    */
    
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setActive(Bolean active) {
        this.active = active;
    }
    public void setRole(String role) {
        this.role = role;
    }
    /*
        cart()
        orderList()
    */
}