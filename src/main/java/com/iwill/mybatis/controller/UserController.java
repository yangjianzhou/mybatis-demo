package com.iwill.mybatis.controller;

import com.iwill.mybatis.dao.mapper.ext.UserMapperExt;
import com.iwill.mybatis.dao.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapperExt userMapperExt;

    @GetMapping("get-user-info")
    public String getUserInfo() {
        List<UserDTO> userList = userMapperExt.findUserListByName("ZHANGSAN");
        return "SUCCESS";
    }

}
