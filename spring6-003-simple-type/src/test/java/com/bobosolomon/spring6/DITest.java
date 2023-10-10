package com.bobosolomon.spring6;

import com.bobosolomon.spring6.beans.A;
import com.bobosolomon.spring6.beans.MyDataSource;
import com.bobosolomon.spring6.beans.Student;
import com.bobosolomon.spring6.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {

    @Test
    public void testCasecade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-cascade.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
    @Test
    public void testAllSimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-all-simple-type.xml");
        A a = applicationContext.getBean("a", A.class);
        System.out.println(a);
    }

    @Test
    public void testSimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-simple-type.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }
@Test
    public void testDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dataSource.xml");
        MyDataSource myDataSource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }
}
