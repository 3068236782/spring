package com.xkz.test0208;

import com.xkz.day0208.BeanScope;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/09/17:32
 * @Description:
 */
public class Testing {

    @Test
    public void Test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext0208.xml");
        BeanScope beanscope = classPathXmlApplicationContext.getBean("beanscope", BeanScope.class);

    }



    @Test
    public void Test1(){
        Hashtable<Object, Object> properties = System.getProperties();
        System.out.println(properties);
        Enumeration<Object> keys = properties.keys();
        System.out.println(keys);
        System.out.println(properties.get(keys));

    }
}
