package com.hwhl.yuanyu.mapper;

import com.hwhl.yuanyu.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zhoulei on 2018/4/8.
 */
@Repository
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public Integer addUser(User user);
}
