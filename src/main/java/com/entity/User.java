package com.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private Integer id;
    private String password;
    private Integer age;

    public User() {
    }

    public User(String userName, Integer id, String password, Integer age) {
        this.userName = userName;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
