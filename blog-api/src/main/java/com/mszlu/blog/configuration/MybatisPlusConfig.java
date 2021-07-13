package com.mszlu.blog.configuration;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

// @ 是为了能让spring扫描的到

@Configuration
// 添加的一个扫包路径， 扫包是啥？
// means 一会有关mybatis的接口我们都写在 mapper下面，之后spring就可以扫描到他，然后生成一个代理实现类，并且注射到我们的Spring里面去
@MapperScan("com.mszlu.blog.mapper")
public class MybatisPlusConfig {

    // 分页插件
    // 拦截器？？
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
