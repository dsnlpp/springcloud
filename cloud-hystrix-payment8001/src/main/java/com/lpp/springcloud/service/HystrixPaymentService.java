package com.lpp.springcloud.service;/*

@author shkstart

@create 2023-09-04 23:27

*/

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

@Service
public class HystrixPaymentService {

    public String find(long id)
    {
        return Thread.currentThread().getName()+"queryPaymentById: run"+id+"hahaha";
    }

    //演示服务降级：当方法的运行条件不满足HystrixCommond中的条件时，执行fallback中制定的方法。
    @HystrixCommand(fallbackMethod = "dept_TimeoutHandler",
            commandProperties =
                    //规定 5 秒钟以内就不报错，正常运行，超过 5 秒就报错，调用指定的方法
                    {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})
    public String insert(long id)
    {
        int outTime = 6;
        try {
            TimeUnit.SECONDS.sleep(outTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName()+"queryPaymentById: run"+id+"笑嘻嘻";
    }
    private String dept_TimeoutHandler(long id){
        return Thread.currentThread().getName()+"queryPaymentById: run"+id+"(#^.^#)";
    }

}
