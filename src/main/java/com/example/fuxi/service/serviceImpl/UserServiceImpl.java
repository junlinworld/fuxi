package com.example.fuxi.service.serviceImpl;

import com.example.fuxi.Dao.UserDao;
import com.example.fuxi.pojo.User;
import com.example.fuxi.service.Userface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements Userface {
    @Autowired
    UserDao userDao=null;

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int deleteUser(String userName) {
        return userDao.deleteUser(userName);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }
}
