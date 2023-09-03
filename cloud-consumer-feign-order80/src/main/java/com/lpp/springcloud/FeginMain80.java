package com.lpp.springcloud;/*

@author shkstart

@create 2023-09-03 21:04

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EnableFeignClients 使用OpenFegin需要在启动类上添加该注解
 */
@SpringBootApplication
@EnableFeignClients
public class FeginMain80 {
    public static void main(String[] args) {
        SpringApplication.run(FeginMain80.class,args);
    }
}
