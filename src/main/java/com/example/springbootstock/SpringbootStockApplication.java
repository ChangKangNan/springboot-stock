package com.example.springbootstock;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringbootStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStockApplication.class, args);
    }

}
