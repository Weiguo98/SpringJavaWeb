package com.mszlu.blog;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动类
@SpringBootApplication
public class BlogApp {
    public static void main(String[] args) {
//        BasicConfigurator.configure();
        SpringApplication.run(BlogApp.class,args);
    }
}
