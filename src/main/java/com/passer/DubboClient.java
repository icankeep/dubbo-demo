package com.passer;

import com.passer.config.DubboClientConfig;
import com.passer.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhouwenhua02
 * @date 2021/3/13
 */
public class DubboClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboClientConfig.class);
        context.start();
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getUser());
    }
}
