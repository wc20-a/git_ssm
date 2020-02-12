package com.wc.service;

import com.wc.domain.User;

/**
 * @Author: 汪诚
 * @Date: 2020/2/3 17:19
 */
public interface UserService {

    public User login(User user) throws Exception;
}
