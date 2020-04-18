package com.zps.demo.mapper;

import com.zps.demo.domain.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by zps on 2020/4/18 19:48
 */
public interface UserMapper extends Mapper<User> {

    public List<User> findAll();
}
