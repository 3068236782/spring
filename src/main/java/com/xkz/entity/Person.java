package com.xkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @Date: 2022/02/02/7:25
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int id;

    private String name;

    private int age;

    private long money;

    private User user;


    public Person(String id, String name, String age, String money) {
    }
}
