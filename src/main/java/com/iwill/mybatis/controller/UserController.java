package com.iwill.mybatis.controller;

import com.iwill.mybatis.dao.mapper.ext.UserMapperExt;
import com.iwill.mybatis.dao.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapperExt userMapperExt;

    @Transactional
    @GetMapping("get-userInfo")
    public String getUserInfo() {
        userMapperExt.findUserListByName("zhangsan");
        userMapperExt.findUserListByName("zhangsan");
        return "SUCCESS";
    }

    @Transactional
    @GetMapping("get-userInfo-around-update")
    public String getUserInfoAroundUpdate() {
        userMapperExt.findUserListByName("zhangsan");
        userMapperExt.updateByName("zhangsan",20);
        userMapperExt.findUserListByName("zhangsan");
        return "SUCCESS";
    }

    @Transactional
    @GetMapping("get-userInfo-around-insert")
    public String getUserInfoAroundInsert() {
        userMapperExt.findUserListByName("zhangsan");
        UserDTO user = new UserDTO("zhangsan" ,21);
        userMapperExt.insert(user);
        userMapperExt.findUserListByName("zhangsan");
        return "SUCCESS";
    }

    @Transactional
    @GetMapping("update-userInfo")
    public String updateUserInfo() {
        userMapperExt.update("name" ,"lisi",23);
        return "SUCCESS";
    }

}
