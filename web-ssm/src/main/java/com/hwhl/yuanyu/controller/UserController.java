package com.hwhl.yuanyu.controller;

import com.hwhl.yuanyu.entity.User;
import com.hwhl.yuanyu.service.UserService;
import com.hwhl.yuanyu.utils.ErrorMessage;
import com.hwhl.yuanyu.utils.Message;
import com.hwhl.yuanyu.validatorannotation.First;
import com.hwhl.yuanyu.validatorannotation.RegisterGroupValidator;
import com.hwhl.yuanyu.validatorannotation.Second;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhoulei on 2018/4/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    Logger log = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/testAddUser")
    @ResponseBody
    public Message testAddUser(@Validated({RegisterGroupValidator.class}) User user, BindingResult bindingResult){
        log.debug(user.toString());
        Message message = Message.non();

        if (bindingResult.hasErrors()){
            message.code(Message.codeFailured).message(ErrorMessage.getFieldErrorMessage(bindingResult));
            return message;
        }
        //System.out.println(user);


        Integer integer = userService.addUser(user);

        return integer==1 ? message.code(Message.codeSuccessed).message("注册成功") :message.code(Message.codeFailured).message("注册失败");
    }
}
