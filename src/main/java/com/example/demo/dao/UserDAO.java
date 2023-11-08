package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.User;

public interface UserDAO {
    void insertUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}