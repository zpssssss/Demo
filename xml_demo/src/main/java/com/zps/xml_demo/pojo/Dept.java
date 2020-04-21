package com.zps.xml_demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by zps on 2020/4/20 22:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("dept")
public class Dept {

    @TableId
    private Integer id;

    @TableField("dname")
    private String name;
    private String loc;
    private List<Emp> empList;




}
