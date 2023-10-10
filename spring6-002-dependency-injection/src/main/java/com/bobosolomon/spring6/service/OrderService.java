package com.bobosolomon.spring6.service;

import com.bobosolomon.spring6.dao.OrderDao;
import com.bobosolomon.spring6.dao.UserDao;

public class OrderService {
    private OrderDao orderDao;
    private UserDao userDao;

    // 通过反射机制调用构造方法给属性赋值
    public  OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public OrderService(UserDao userDao, OrderDao orderDao) {
        this.userDao = userDao;
        this.orderDao = orderDao;
            }

    public void delete(){
        orderDao.deleteById();
        userDao.insert();
    }
}
