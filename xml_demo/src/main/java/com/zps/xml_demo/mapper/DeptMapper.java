package com.zps.xml_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.xml.internal.bind.v2.model.core.ID;
import com.zps.xml_demo.pojo.Dept;
import com.zps.xml_demo.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zps on 2020/4/20 22:56
 */
public interface DeptMapper extends BaseMapper<Dept> {

    @Results({
            @Result( id = true,column = "id",property = "id"),
            @Result(column = "dname",property = "name"),
            @Result(column = "loc",property = "loc"),
            @Result(column = "id",
                    property = "empList",
                    javaType = List.class,
                    many = @Many(select = "com.zps.xml_demo.mapper.EmpMapper.findEmpById")
            ),
    })
    @Select("SELECT * FROM dept")
    public List<Dept> findAll();


    public List<Dept> findAll2();
}
