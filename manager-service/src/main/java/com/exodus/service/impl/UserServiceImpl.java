package com.exodus.service.impl;

import com.exodus.mapper.UserMapper;
import com.exodus.pojo.User;
import com.exodus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: soushihou
 * @Date: 2020/2/8
 * @Description: com.exodus.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        this.userMapper.insertUser(user);
    }
}
