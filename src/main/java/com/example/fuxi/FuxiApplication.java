package com.example.fuxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.fuxi.Dao")
public class FuxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuxiApplication.class, args);
    }

}
