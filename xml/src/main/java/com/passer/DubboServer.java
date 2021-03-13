package com.passer;


import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboServer {
    public static void main(String[] args) throws BeansException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/src/main/resources/spring-dubbo.xml");
        context.start();
        System.in.read();
    }
}
