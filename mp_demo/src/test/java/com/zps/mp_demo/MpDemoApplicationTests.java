package com.zps.mp_demo;

import com.zps.mp_demo.domain.User;
import com.zps.mp_demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MpDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public  void Test() {
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
