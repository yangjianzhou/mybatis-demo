package com.iwill.mybatis.dao.mapper.ext;

import com.iwill.mybatis.dao.mapper.gen.UserMapper;
import com.iwill.mybatis.dao.model.UserDTO;

import java.util.List;

public interface UserMapperExt extends UserMapper {

    List<UserDTO> findUserListByName(String username);
}
