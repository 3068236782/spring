package com.xkz.day0218.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/21/19:24
 * @Description:
 */
@Aspect
@Component("myaspect")
public class MyAspect {

    @Around(value = "execution(* *..Persionimpl.before(..))")
    public Object myBefore(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object object = null;
        System.out.println("调用的时间:"+new Date()+"毫秒值："+System.currentTimeMillis());
        proceedingJoinPoint.proceed();
        System.out.println("调用完成:"+new Date()+"毫秒值："+System.currentTimeMillis());
        return object;
    }

}
