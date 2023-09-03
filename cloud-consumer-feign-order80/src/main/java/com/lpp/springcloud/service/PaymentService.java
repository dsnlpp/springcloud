package com.lpp.springcloud.service;/*

@author shkstart

@create 2023-09-03 21:06

*/

import com.lpp.springcloud.entities.CommonResult;
import com.lpp.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface PaymentService {

    @GetMapping(value = "/payment/find/{id}")
    public CommonResult<Payment> find(@PathVariable("id") Integer id);

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment);
}
