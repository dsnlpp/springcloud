package com.lpp.springcloud.controller;/*

@author shkstart

@create 2023-08-12 22:09

*/

import com.lpp.springcloud.entities.CommonResult;
import com.lpp.springcloud.entities.Payment;
import com.lpp.springcloud.service.impl.PaymentDaoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentDaoServiceImpl paymentDaoServiceImpl;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int i = paymentDaoServiceImpl.savePayment(payment);
        log.info("*****插入结果为"+i);
        if (i>0)
        {
            return new CommonResult(200,"插入成功",i);
        }
        return new CommonResult(444,"插入失败",i);
    }

    @GetMapping(value = "/payment/find/{id}")
    public CommonResult<Payment> find(@PathVariable Integer id)
    {
        Payment payment = paymentDaoServiceImpl.queryById(id);
        log.info("*****查询结果为"+payment);
        if (payment!=null)
        {
            return new CommonResult<Payment>(200,"查询成功",payment);
        }
        return new CommonResult<Payment>(444,"查询失败",payment);
    }

}
