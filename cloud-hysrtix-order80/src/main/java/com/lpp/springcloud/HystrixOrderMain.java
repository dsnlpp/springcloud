package com.lpp.springcloud;/*

@author shkstart

@create 2023-09-09 0:05

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker  //开启服务熔断
public class HystrixOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrderMain.class,args);
    }
}
