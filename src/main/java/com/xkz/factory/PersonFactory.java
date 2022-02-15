package com.xkz.factory;

import com.xkz.entity.Person;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @Date: 2022/02/02/7:43
 * @Description:
 */
public class PersonFactory {

    public static Person SelectFac(int id, String name, int age, long money) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        person.setMoney(money);
        return person;
    }
}
