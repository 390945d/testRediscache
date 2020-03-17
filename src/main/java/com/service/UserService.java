package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@CacheConfig(cacheNames = "User")
@Service
public class UserService {
@Autowired
    private UserDao userDao;
@CachePut(key = "#u.userName",value = "user")
public Integer add(User u){
    System.out.println("dao层连接Mysql");
    Integer i = userDao.addUser(u);
    return i;
}
@Cacheable(key = "#id",value = "user")
public User find(Integer id){
    System.out.println("dao层连接Mysql");
    User u = userDao.findById(id);
    return u;
}
@CacheEvict(key = "#id",allEntries = true,value = "user")
public Integer delete(Integer id){
    System.out.println("dao层连接Mysql");
    Integer i = userDao.delete(id);
    return i;
}
}
