package com.exodus.mapper;

import com.exodus.pojo.User;

import java.util.List;

/**
 * @Author: soushihou
 * @Date: 2020/1/31
 * @Description: com.exodus.mapper
 * @version: 1.0
 */
public interface UserMapper {
    void insertUser(User user);
    List<User> selectUserAll();
}
