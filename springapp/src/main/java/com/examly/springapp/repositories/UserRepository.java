package com.examly.springapp.repositories;

import com.examly.springapp.models.UserModel;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, String> {
    
}
