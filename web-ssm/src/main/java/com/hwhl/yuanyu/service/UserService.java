package com.hwhl.yuanyu.service;

import com.hwhl.yuanyu.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by zhoulei on 2018/4/8.
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public Integer addUser(User user);
}
