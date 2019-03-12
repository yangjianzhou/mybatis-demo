package com.iwill.mybatis.controller;

import com.iwill.mybatis.bean.User;
import com.iwill.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("get-user-info")
    public String getUserInfo() {
        List<User> userList = userMapper.findUserListByName(new User());
        return "SUCCESS";
    }

}
