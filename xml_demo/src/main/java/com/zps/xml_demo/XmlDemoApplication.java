package com.zps.xml_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zps.xml_demo.mapper")
public class XmlDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(XmlDemoApplication.class, args);
    }

}
