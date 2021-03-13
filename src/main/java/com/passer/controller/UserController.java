package com.passer.controller;

import com.passer.domain.User;
import com.passer.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

/**
 * @author zhouwenhua02
 * @date 2021/3/13
 */
@Component
public class UserController {
    @Reference
    private UserService userService;

    public void sayHello() {
        User user = userService.getUser();
        System.out.println(user.getUsername() + " say hello to everyone");
    }
}
