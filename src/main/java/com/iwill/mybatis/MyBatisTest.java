package com.iwill.mybatis;

import com.iwill.mybatis.dao.mapper.ext.UserMapperExt;
import com.iwill.mybatis.dao.model.UserDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisTest {

    public static void main(String[] args) throws Exception {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapperExt userMapperExt = sqlSession.getMapper(UserMapperExt.class);

        userMapperExt.insert(new UserDTO("houliu",23));
        userMapperExt.findUserListByName("zhangsan");
        userMapperExt.update("name" ,"wangwu",22);
        sqlSession.commit();

    }

}
