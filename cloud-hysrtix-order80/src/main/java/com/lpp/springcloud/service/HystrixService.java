package com.lpp.springcloud.service;/*

@author shkstart

@create 2023-09-09 0:11

*/

import impl.MyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "FeignClient-1",fallback = MyHystrix.class)
public interface HystrixService {


    @GetMapping("/consumer/payment/query/{id}")
    public String find(@PathVariable("id") long id);


    @GetMapping("/consumer/payment/insert/{id}")
    public String insert(@PathVariable("id") long id);

}
