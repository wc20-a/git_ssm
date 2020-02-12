package com.wc.service.impl;


import com.wc.domain.User;
import com.wc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 汪诚
 * @Date: 2020/2/3 17:20
 */

@Service
public class UserServiceImpl implements com.wc.service.UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) throws Exception {
        return userMapper.login(user);
    }
}
