package com.xkz.day0216;

import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/16/18:16
 * @Description:
 */
public class Testing {

    @Test
    public void testing(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext0216.xml");
        Demo demo = classPathXmlApplicationContext.getBean("demo", Demo.class);
        demo.demo1();
        demo.demo2();
        demo.demo3();

    }


}
