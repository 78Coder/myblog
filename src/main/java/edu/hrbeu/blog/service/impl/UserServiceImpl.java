package edu.hrbeu.blog.service.impl;

import edu.hrbeu.blog.entity.User;
import edu.hrbeu.blog.mapper.UserMapper;
import edu.hrbeu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;


    @Override
    public List<User> listUser() {
        List<User> users = userMapper.findAll();


        return users;
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public User insertUser(User user) {
        user.setUserRegisterTime(new Date());
        userMapper.insert(user);
        return user;
    }

    @Override
    public User getUserByNameOrEmail(String str) {
        return userMapper.getUserByNameOrEmail(str);
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }
}
