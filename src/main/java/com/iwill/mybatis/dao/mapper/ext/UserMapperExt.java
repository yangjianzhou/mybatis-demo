package com.iwill.mybatis.dao.mapper.ext;

import com.iwill.mybatis.dao.mapper.gen.UserMapper;
import com.iwill.mybatis.dao.model.UserDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapperExt extends UserMapper {

    List<UserDTO> findUserListByName(@Param("name") String name);

    int updateByName(@Param("name") String name ,@Param("age") int age);

    @Update("update cnt_user")
    int update(@Param("columnName") String columnName ,@Param("name") String name,@Param("age") int age);

}
