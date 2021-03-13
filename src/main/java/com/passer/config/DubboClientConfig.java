package com.passer.config;

import com.passer.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhouwenhua02
 * @date 2021/3/13
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.passer")
@PropertySource("dubbo-consumer.properties")
public class DubboClientConfig {
    @Reference
    private UserService userService;
}
