package com.lpp.springcloud.controller;/*

@author shkstart

@create 2023-09-10 11:18

*/

import com.lpp.springcloud.service.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HystrixOrderController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/consumer/payment/query/{id}")
    public String find(@PathVariable("id") long id){
        return hystrixService.find(id);
    }


    @GetMapping("/consumer/payment/insert/{id}")
    public String insert(@PathVariable("id") long id){
        return hystrixService.insert(id);
    }


}
