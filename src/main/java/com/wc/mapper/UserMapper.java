package com.wc.mapper;

import com.wc.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: 汪诚
 * @Date: 2020/2/3 17:17
 */
public interface UserMapper {

    @Select("select * from user where username = #{username} and password = #{password}")
    public User login(User user);
}
