package com.fjs.backoffice.service.impl;

import com.fjs.backoffice.mapper.UserMapper;
import com.fjs.backoffice.model.User;
import com.fjs.backoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        userMapper.register(user);
    }
}
