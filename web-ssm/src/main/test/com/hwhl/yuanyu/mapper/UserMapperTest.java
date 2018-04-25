package com.hwhl.yuanyu.mapper;

import com.hwhl.yuanyu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by zhoulei on 2018/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void addUser() throws Exception {
        userMapper.addUser(new User());
    }

}