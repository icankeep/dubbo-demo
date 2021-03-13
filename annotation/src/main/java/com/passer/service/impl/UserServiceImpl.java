package com.passer.service.impl;


import com.passer.domain.User;
import com.passer.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private User user;

    @Override
    public User getUser() {
        return user;
    }
}
