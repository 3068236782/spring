package com.xkz.test0211;

import com.xkz.day0211.MyClassPathXmlApplicationContext;
import org.dom4j.DocumentException;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/11/17:14
 * @Description:
 */
public class Testing0211 {


    @Test
    public void test0211(){
        MyClassPathXmlApplicationContext myClassPathXmlApplicationContext = new MyClassPathXmlApplicationContext("/ApplicationContext.xml");
        try {
            Object beanscope = myClassPathXmlApplicationContext.getBean("person1");
            System.out.println(beanscope);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
