package com.passer;


import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

public class DubboServer {
    public static void main(String[] args) throws BeansException, IOException {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/spring-dubbo.xml");
        context.start();
        System.in.read();
    }
}
