package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
* @Description: 启动类
* @Param: 
* @return: 
* @Author: qiaoqiao
* @Date: 2022/10/13
*/
@EnableScheduling
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("-------------------------------------------启动成功!");
    }

}
