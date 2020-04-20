package com.zps.mp_demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;


/**
 * Created by zps on 2020/4/18 19:40
 */
@Data
@TableName("user")
@ToString
public class User {
    @TableId
    private Integer id;
    @TableField("age")
    private Integer age;
    @TableField("username")
    private String username;
    @TableField("password")
    private String password;
    @TableField("email")
    private String email;
    @TableField("sex")
    private String sex;


}
