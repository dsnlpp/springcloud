package com.lpp.springcloud.service;/*

@author shkstart

@create 2023-09-09 0:11

*/

import com.lpp.springcloud.service.impl.HystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-HYSTRIX-PAYMENT",fallback = HystrixServiceImpl.class)
public interface HystrixService {


    @GetMapping("/payment/query/{id}")
    public String find(@PathVariable("id") long id);


    @GetMapping("/payment/insert/{id}")
    public String insert(@PathVariable("id") long id);

}
