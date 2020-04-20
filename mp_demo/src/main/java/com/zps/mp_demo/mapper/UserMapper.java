package com.zps.mp_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zps.mp_demo.domain.User;
import java.util.List;

/**
 * Created by zps on 2020/4/19 22:37
 */
public interface UserMapper extends BaseMapper<User> {


    public List<User> findAll();
}
