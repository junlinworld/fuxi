package com.example.fuxi.controllers;

import com.example.fuxi.pojo.User;
import com.example.fuxi.service.serviceImpl.UserServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService=null;

    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public int insertUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/getUserByName",method = RequestMethod.GET)
    public User getUserByName(String userName){
        return userService.getUserByName(userName);
    }

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public User getUserById(int userId){
        return userService.getUserById(userId);
    }
}
