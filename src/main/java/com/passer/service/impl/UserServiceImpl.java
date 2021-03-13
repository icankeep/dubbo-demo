package com.passer.service.impl;

import com.passer.domain.User;
import com.passer.service.UserService;


public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("passer");
        return user;
    }
}
