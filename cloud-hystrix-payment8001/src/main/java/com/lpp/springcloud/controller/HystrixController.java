package com.lpp.springcloud.controller;/*

@author shkstart

@create 2023-09-04 23:36

*/

import com.lpp.springcloud.service.HystrixPaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class HystrixController {

    @Autowired
    private HystrixPaymentService hystrixPaymentService;

    @GetMapping("/payment/query/{id}")
    public String find(@PathVariable("id") long id)
    {
        return hystrixPaymentService.find(id);
    }

    @GetMapping("/payment/insert/{id}")
    public String insert(@PathVariable("id") long id)
    {
        return hystrixPaymentService.insert(id);
    }

}
