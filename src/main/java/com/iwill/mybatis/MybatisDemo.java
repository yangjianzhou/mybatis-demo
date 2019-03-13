package com.iwill.mybatis;

import com.iwill.mybatis.dao.mapper.ext.UserMapperExt;
import com.iwill.mybatis.dao.model.UserDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisDemo {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapperExt userMapper = sqlSession.getMapper(UserMapperExt.class);
        UserDTO user = new UserDTO();
        user.setName("lisi");
        List<UserDTO> userList = userMapper.findUserListByName("zhangsan");
        System.out.println(userList.size());
    }
}
