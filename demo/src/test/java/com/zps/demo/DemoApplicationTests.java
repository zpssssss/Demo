package com.zps.demo;

import com.zps.demo.domain.User;
import com.zps.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void Test() {
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }


}
