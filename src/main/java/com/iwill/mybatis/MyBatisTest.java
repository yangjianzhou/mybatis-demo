package com.iwill.mybatis;

import com.iwill.mybatis.dao.mapper.ext.UserMapperExt;
import com.iwill.mybatis.dao.model.UserDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;

public class MyBatisTest {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapperExt userMapperExt = sqlSession.getMapper(UserMapperExt.class);
        //List<UserDTO> userDTOList = userMapperExt.findUserListByName("zhangsan");
        userMapperExt.insert(new UserDTO("houliu",23));
        //userDTOList = userMapperExt.findUserListByName("zhangsan");
        //userMapperExt.update("name" ,"wangwu",22);
        sqlSession.commit();
        //sqlSession.close();

        //userDTOList = userMapperExt.findUserListByName("zhangsan");
        //userMapperExt.update("name" ,"wangwu",22);
        //sqlSession.commit();
        /*SqlSession sqlSession1 = sqlSessionFactory.openSession();
        UserMapperExt userMapperExt1 = sqlSession1.getMapper(UserMapperExt.class);
        List<UserDTO> userDTOList1 = userMapperExt1.findUserListByName("zhangsan");*/

        Class<?> boundType = null;
        try {
            boundType = Resources.classForName("com.iwill.mybatis.dao.mapper.ext.UserMapperExt");
        } catch (ClassNotFoundException e) {
            //ignore, bound type is not required
        }
        if (boundType != null) {
            Method[] methods = boundType.getDeclaredMethods();
            for (Method method : methods){
                System.out.println(method.getName());
        }
    }
    }

}
