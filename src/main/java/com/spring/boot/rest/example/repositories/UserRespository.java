package com.spring.boot.rest.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.rest.example.model.User;

public interface UserRespository extends CrudRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);

}
