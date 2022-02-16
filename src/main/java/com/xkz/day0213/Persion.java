package com.xkz.day0213;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/16/17:09
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Service
public class Persion {

    @Value("0")
    private int id;

//    @Value("小珂子")
    private String name;

    @Value("18")
    private int age;

    @Value("中国")
    private String address;

}
