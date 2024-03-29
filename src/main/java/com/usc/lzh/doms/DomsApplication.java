package com.usc.lzh.doms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://localhost:8080/login.html
 */
@MapperScan("com.usc.lzh.doms.mapper")
@SpringBootApplication
public class DomsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomsApplication.class, args);
    }

}
