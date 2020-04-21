package com.zps.xml_demo;

import com.zps.xml_demo.mapper.DeptMapper;
import com.zps.xml_demo.pojo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XmlDemoApplicationTests {

    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void Test() {
        List<Dept> all = deptMapper.findAll();
        for (Dept dept : all) {
            System.out.println(dept);
        }
    }

    @Test
    public void Test2() {
        List<Dept> all = deptMapper.findAll2();
        for (Dept dept : all) {
            System.out.println(dept);
        }
    }

}
