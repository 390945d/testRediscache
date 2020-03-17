package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
    User findById(Integer id);
     @Insert("insert into user(userName,password,age) values(#{userName},#{password},#{age})")
    Integer addUser(User user);
     @Delete("delete from user where id=#{id}")
    Integer delete(Integer id);
}
