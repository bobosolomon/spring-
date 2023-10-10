package com.bobosolomon.spring6.service;

import com.bobosolomon.spring6.dao.UserDao;

public class UserService {
    private UserDao userDao;

    // 使用set方法注入，必须提供 set方法
    // 反射机制要调用这个方法给属性赋值

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.insert();
    }
}
