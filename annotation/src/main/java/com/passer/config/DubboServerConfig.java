package com.passer.config;

import com.passer.domain.User;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.passer")
@PropertySource("classpath:dubbo-provider.properties")
public class DubboServerConfig {

    @Bean
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("passer");
        return user;
    }
}
