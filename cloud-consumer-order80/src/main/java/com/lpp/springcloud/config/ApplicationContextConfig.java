package com.lpp.springcloud.config;/*

@author shkstart

@create 2023-08-13 23:28

*/

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 借助RestTemplate来调用其他module的功能模块；
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate returnRestTemplate()
    {
        return new RestTemplate();
    }
}
