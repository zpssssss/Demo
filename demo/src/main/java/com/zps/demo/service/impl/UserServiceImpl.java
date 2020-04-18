package com.zps.demo.service.impl;

import com.zps.demo.domain.User;
import com.zps.demo.mapper.UserMapper;
import com.zps.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zps on 2020/4/18 19:51
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
            return userMapper.findAll();
    }

}
