package com.xkz.day0221.DAO;

import com.xkz.day0221.Persion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.Period;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/22/19:19
 * @Description:
 */

@Repository
public class PersionDAO {

//    @Resource(name = "jdbcTemplate")
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(propagation = Propagation.REQUIRED, timeout = -1,isolation = Isolation.DEFAULT)
    public int insertPersion(Persion persion){
        System.out.println(persion);
        String sql = "insert into persion(name,age,address) values(?,?,?)";
        System.out.println(jdbcTemplate.toString());
        int update = jdbcTemplate.update(sql, persion.getName(),persion.getAge(),persion.getAddress());
        System.out.println("有"+update+"行数据收到改变");
        return update;
    }
}
