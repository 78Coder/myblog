package edu.hrbeu.blog.mapper;

import edu.hrbeu.blog.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@ContextConfiguration("classpath:spring/spring-mybatis.xml")
public class testUser {
    @Autowired
    UserMapper um;



    @Test
    public void testFindAll() throws IOException {
        List<User> users = um.findAll();
        System.out.println(users);


    }
}
