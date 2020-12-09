package com.atguigu.springall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atguigu.springall.mapper")
@SpringBootApplication
public class SpringallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringallApplication.class, args);
    }

}
