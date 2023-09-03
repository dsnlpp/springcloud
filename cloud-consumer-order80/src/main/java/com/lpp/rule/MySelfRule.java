package com.lpp.rule;/*

@author shkstart

@create 2023-09-03 20:38

*/

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MySelfRule {

    @Bean
    public IRule selfRule()
    {
        return new RandomRule();
    }


}
