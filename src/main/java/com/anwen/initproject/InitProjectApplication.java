package com.anwen.initproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.anwen.initproject.mapper") // 这里注意换成你当前项目的正确路径
public class InitProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitProjectApplication.class, args);
    }

}
