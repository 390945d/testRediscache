package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
  @Autowired
  private UserService userService;
  @Autowired
  private RedisTemplate<String, Object> redisTemplate;
  @Autowired
  private StringRedisTemplate stringRedisTemplate;
  @RequestMapping("/findById")
  public User findById(String id){
    //User user = (User)redisTemplate.opsForValue().get(id);
    Integer i = Integer.valueOf(id);
    User u = userService.find(i);
    return u;
  }
  @RequestMapping("/addUser")
  public Integer addUser(){
    //stringRedisTemplate.opsForValue().set(testString,"test");
    User user = new User();
    user.setPassword("12345");
    user.setUserName("桃花");
    user.setAge(21);
     //redisTemplate.opsForValue().set(user.getUserName(),user);
    Integer i = userService.add(user);
    return i;
  }
  @RequestMapping("/delete")
  public Integer deleteUser(String id){
    //redisTemplate.delete(id);
    Integer i = Integer.valueOf(id);
    Integer ic = userService.delete(i);
    return ic;
  }
}
