package com.police.boot.service.impl;

import com.police.boot.mapper.UserMapper;
import com.police.boot.model.User;
import com.police.boot.service.UserServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by roper on 2017/5/15.
 */

@Service
public class UserService implements UserServiceFacade {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public String getUserNameById(int id) {
        return userMapper.getUserNameById(id);
    }
}