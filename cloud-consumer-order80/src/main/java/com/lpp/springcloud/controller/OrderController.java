package com.lpp.springcloud.controller;
/*
@author shkstart

@create 2023-08-13 17:43
*/

import com.lpp.springcloud.entities.CommonResult;
import com.lpp.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    private final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/find/{id}")
    public CommonResult<Payment> find(@PathVariable("id") int id)
    {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/find/"+id,CommonResult.class);
    }
}
