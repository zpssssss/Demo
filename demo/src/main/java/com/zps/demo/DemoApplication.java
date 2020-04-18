package com.zps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zps.demo.mapper")
@EntityScan("com.zps.demo.domain")
public class DemoApplication {
    //启动类
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void test(){
        System.out.println("Testq"+ "    Test");
    }

    public void test2(){
        System.out.println("Test");
    }
}
