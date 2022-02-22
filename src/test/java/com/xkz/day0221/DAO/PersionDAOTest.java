package com.xkz.day0221.DAO;

import com.xkz.day0221.Persion;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/22/19:24
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext0221.xml")
public class PersionDAOTest {

    @Autowired
    private PersionDAO persionDAO;
//    @BeforeClass
//    public static void PersionDAOTest(){
//        new ClassPathXmlApplicationContext("ApplicationContext0221.xml");
//    }


    @Test
    public void insert(){
        Persion persion = new Persion();
//        persion.setId(5);
        persion.setName("肥波");
        persion.setAge(25);
        persion.setAddress("安徽合肥");
        System.out.println(persion);
        //你这里不能自己new 要么    直接找容器拿   你自己new的Spring没有给你注入

//        int i = new PersionDAO().insertPersion(persion);
        persionDAO.insertPersion(persion);
//        System.out.println(i);
    }

}