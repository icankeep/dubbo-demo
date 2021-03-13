package com.passer.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhouwenhua02
 * @date 2021/3/13
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.passer")
@ComponentScan(value = {"com.passer.controller"})
@PropertySource("classpath:dubbo.properties")
public class DubboClientConfig {
}
