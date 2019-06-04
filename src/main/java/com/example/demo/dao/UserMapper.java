package com.example.demo.dao;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
    public User selectUser(@Param("user") User user);
}
