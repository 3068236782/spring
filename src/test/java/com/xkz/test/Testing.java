package com.xkz.test;

import com.xkz.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: 2022/02/02/7:36
 * @Description:
 */
public class Testing {
   
    @Test
    public void Test0120(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = classPathXmlApplicationContext.getBean("person2", Person.class);
        System.out.println(person);



    }


}
