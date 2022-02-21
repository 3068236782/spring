package com.xkz.day0218.aspect;

import com.xkz.day0218.persion.Persion;
import junit.framework.TestCase;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/21/19:32
 * @Description:
 */
public class MyAspectTest {


    @Test
    public void testing(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext0218.xml");
        Persion persion = classPathXmlApplicationContext.getBean("persion", Persion.class);
        System.out.println(persion.getClass().getName());
        String kl = persion.before("kl", 123);
        System.out.println(kl);
    }
}