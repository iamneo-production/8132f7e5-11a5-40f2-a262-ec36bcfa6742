package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.model.UserModel;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public void addNewUser(UserModel user) {
        userRepository.save(user);
    }

    public boolean findUserById(String id) {
        return userRepository.existsById(id);
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    public UserModel getUserById(String id) {
        return userRepository.findById(id).get();
    }

    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}
