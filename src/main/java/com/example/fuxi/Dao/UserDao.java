package com.example.fuxi.Dao;

import com.example.fuxi.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int insertUser(@Param("user") User user);
    int deleteUser(@Param("userName") String userName);
    int updateUser(@Param("user") User user);
    User getUserByName(@Param("userName") String userName);
    User getUserById(@Param("userId") int userId);

}

