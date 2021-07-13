package com.mszlu.blog.configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        // 跨域配置 后端是8888端口，前端是8080端口，相等于两个不同域名（服务器）之间访问
        // 所以要允许浏览器的8080端口访问8888接口
        registry.addMapping("/**").allowedOrigins("http://localhost:8080");
    }
}
