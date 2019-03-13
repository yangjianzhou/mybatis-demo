package com.iwill.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.iwill.mybatis")
@MapperScan(value = {"com.iwill.mybatis.dao.mapper.ext", "com.iwill.mybatis.dao.mapper.gen"})
@EnableTransactionManagement(proxyTargetClass = true)
public class MyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
