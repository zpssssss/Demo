package com.zps.xml_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zps.xml_demo.pojo.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zps on 2020/4/20 22:57
 */
public interface EmpMapper extends BaseMapper<Emp> {


    @Select("select * from emp where dept_id = #{id}")
    public List<Emp> findEmpById(Integer id);

}
