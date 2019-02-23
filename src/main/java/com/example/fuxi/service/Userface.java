package com.example.fuxi.service;

import com.example.fuxi.pojo.User;

public interface Userface {
    int insertUser(User user);
    int deleteUser(String userName);
    int updateUser(User user);
    User getUserByName(String userName);
    User getUserById(int userId);
}
