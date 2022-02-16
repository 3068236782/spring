package com.xkz.test0213;

import com.xkz.day0213.MyConfig;
import com.xkz.day0213.Persion;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/16/17:14
 * @Description:
 */
public class Testing {

    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Persion setPersion = annotationConfigApplicationContext.getBean("setPersion", Persion.class);
        System.out.println(setPersion);

    }
}
