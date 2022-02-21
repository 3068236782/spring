package com.xkz.day0218;

import com.xkz.day0218.persion.Persion;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/21/19:20
 * @Description:
 */
@Component("persion")
public class Persionimpl implements Persion {

    @Override
    public String before(String name, int age) {
        System.out.println("before方法执行, 执行时间是"+new Date()+"毫秒值："+System.currentTimeMillis());
        return "before";
    }

    @Override
    public String after(String name, int age) {
        System.out.println("after方法执行, 执行时间是"+System.currentTimeMillis());
        return "after";
    }

    @Override
    public String last(String name, int age) {
        System.out.println("last方法执行, 执行时间是"+System.currentTimeMillis());
        return "last";
    }

}
