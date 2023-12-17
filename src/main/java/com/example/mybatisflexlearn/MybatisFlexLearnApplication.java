package com.example.mybatisflexlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/mybatisflexlearn/mapper")
public class MybatisFlexLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisFlexLearnApplication.class, args);
    }

}
