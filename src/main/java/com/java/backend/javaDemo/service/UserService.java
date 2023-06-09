package com.java.backend.javaDemo.service;

import com.java.backend.javaDemo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User save(User user);

    User findById(long id);
}