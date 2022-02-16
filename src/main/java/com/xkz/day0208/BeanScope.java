package com.xkz.day0208;

import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/09/17:23
 * @Description:
 */
//@Scope("prototype")
@Resource
public class BeanScope {

    int a ;

    public BeanScope(int a){
        System.out.println("BeanScope 实例化 (有参构造器)");
    }


    public BeanScope(){
        System.out.println("BeanScope 实例化 (无参构造器)");
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("init method 初始化");
    }

    @PreDestroy
    public void destoryMethod(){
        System.out.println("destory method 销毁");
    }

}
