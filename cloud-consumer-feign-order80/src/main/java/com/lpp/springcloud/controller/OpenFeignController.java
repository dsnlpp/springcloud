package com.lpp.springcloud.controller;/*

@author shkstart

@create 2023-09-03 21:11

*/

import com.lpp.springcloud.entities.CommonResult;
import com.lpp.springcloud.entities.Payment;
import com.lpp.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OpenFeignController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        return paymentService.find(id);
    }

    @PostMapping(value = "/consumer/payment/create")
    public CommonResult create(Payment payment){
        return paymentService.create(payment);
    }


}
