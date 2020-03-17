package com.controller;

import com.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTest {
    @RequestMapping("/getUser")
    @Cacheable(value = "user-key")
    public User getUser(){
        User user = new User("梨花",1,"123",23);
        System.out.println("测试。。。");
        return user;
    }
}
