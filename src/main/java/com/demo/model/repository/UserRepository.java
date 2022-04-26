package com.demo.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
