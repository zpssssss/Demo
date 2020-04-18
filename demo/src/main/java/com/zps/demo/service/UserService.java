package com.zps.demo.service;

import com.zps.demo.domain.User;

import java.util.List;

/**
 * Created by zps on 2020/4/18 19:50
 */
public interface UserService {

    List<User> findAll();
}
