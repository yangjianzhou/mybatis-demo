package com.iwill.mybatis.mapper;

import com.iwill.mybatis.bean.User;

import java.util.List;

public interface UserMapper {

    List<User> findUserListByName(User user);
}
