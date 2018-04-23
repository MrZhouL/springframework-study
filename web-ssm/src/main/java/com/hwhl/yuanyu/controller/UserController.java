package com.hwhl.yuanyu.controller;

import com.hwhl.yuanyu.entity.User;
import com.hwhl.yuanyu.service.UserService;
import com.hwhl.yuanyu.utils.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhoulei on 2018/4/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource()
    private UserService userService;

    @RequestMapping("/testAddUser")
    @ResponseBody
    public Message testAddUser(User user){
        System.out.println(user);

        Message message = Message.non();

        //Integer integer = userService.addUser(user);

        //return integer==1 ? message.code(Message.codeSuccessed).message("注册成功") :message.code(Message.codeFailured).message("注册失败");
        return null;
    }
}
