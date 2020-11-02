package com.itheima.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itheima.server.mapper")
/*
 * EnableResourceServer注解开启资源服务，因为程序需要对外暴露获取token的API和
 * 验证token的API所以该程序也是一个资源服务器
 * */
public class OauthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OauthServerApplication.class, args);
    }
}
