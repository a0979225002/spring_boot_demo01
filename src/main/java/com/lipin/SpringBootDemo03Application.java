package com.lipin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 啟動類
 */
@SpringBootApplication//如果要把它當Spring Boot 啟動類,必須添加此註解
public class SpringBootDemo03Application {
    public static void main(String[] args) {
        /**
         *   必須添加讓他啟動,使用SpringApplication.run方法,
         *   第一個參數是這個class,第二個參數是該main的args
         */
        SpringApplication.run(SpringBootDemo03Application.class,args);
    }
}
