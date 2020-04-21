package com.zps.xml_demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by zps on 2020/4/20 22:49
 */
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("emp")
public class Emp {

    @TableId
    private Integer id;

    @TableField("ename")
    private String name;
    private Integer JobId;
    private  Integer mgr;

    private Date joinDate;
    private BigDecimal salary;
    private BigDecimal bonus;
    private Integer deptId;




}
