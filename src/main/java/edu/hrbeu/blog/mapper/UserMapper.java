package edu.hrbeu.blog.mapper;

import edu.hrbeu.blog.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {


    /**
     * 根据ID删除
     *
     * @param userId
     * @return 影响行数
     */
    int deleteById(Integer userId);

    int insert(User user);


    /**
     *
     * @param user
     * @return 影响行数
     */


    int update(User user);

    User getUserById(Integer userId);

    @Select("select * from user")
    List<User> findAll();

    User getUserByNameOrEmail(String str);

    @Select("Select * from user where user_name = #{str}")
    User getUserByName(String str);

    User getUserByEmail(String str);










}
