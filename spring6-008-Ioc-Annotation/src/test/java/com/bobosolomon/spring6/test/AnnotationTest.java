package com.bobosolomon.spring6.test;

import com.bobosolomon.spring6.bean.BankDao;
import com.bobosolomon.spring6.bean.User;
import com.bobosolomon.spring6.bean.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class AnnotationTest {
    @Test
    public void testBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);


        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);

        BankDao bankDao = applicationContext.getBean("bankDao", BankDao.class);
        System.out.println(bankDao);


    }
}
