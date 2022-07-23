package com.example.lznssb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.lznssb.mapper")
public class LznssbApplication {

    public static void main(String[] args) {
        SpringApplication.run(LznssbApplication.class, args);
    }

}
