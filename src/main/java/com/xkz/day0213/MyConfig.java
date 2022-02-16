package com.xkz.day0213;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.Period;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/16/17:06
 * @Description:
 */

@ComponentScan
@Configuration
public class MyConfig {

    @Autowired(required = false )
    private Persion persion;

    @Bean
    public Persion setPersion(){
        persion.setId(1);
        persion.setName("张三");
        persion.setAge(22);
        persion.setAddress("Asia/上海");
        return persion;
    }

}
