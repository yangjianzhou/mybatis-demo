package com.iwill.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTest {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver"); //classLoader,加载对应驱动
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true", "root", "12345678");
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement = connection.prepareStatement("update cnt_user set age = 201 where name = 'zhangsan'");
        preparedStatement.execute();

        connection.commit();
        preparedStatement = connection.prepareStatement("update cnt_user set age = 233 where name = 'zhangsan'");
        preparedStatement.execute();

        preparedStatement = connection.prepareStatement("insert into cnt_user (age , name) values(100 ,'liusi')");
        preparedStatement.execute();

        connection.commit();

    }
}
