package com.hwhl.yuanyu.service.impl;

import com.hwhl.yuanyu.entity.User;
import com.hwhl.yuanyu.mapper.UserMapper;
import com.hwhl.yuanyu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhoulei on 2018/4/8.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }
}
