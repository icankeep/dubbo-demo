package com.passer.service.impl;

import com.passer.domain.User;
import com.passer.service.UserService;
import org.apache.dubbo.config.annotation.Reference;

import javax.annotation.Resource;


public class UserServiceImpl implements UserService {

    @Reference
    private User user;

    @Override
    public User getUser() {
        return user;
    }
}
