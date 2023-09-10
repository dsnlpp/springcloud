package com.lpp.springcloud.service.impl;/*

@author shkstart

@create 2023-09-10 10:43

*/

import com.lpp.springcloud.service.HystrixService;
import org.springframework.stereotype.Component;

/**
 * 服务熔断后执行的方法
 */
@Component
public class HystrixServiceImpl implements HystrixService {
    @Override
    public String find(long id) {
        return "网络异常,请稍后重试。。。。。。";
    }

    @Override
    public String insert(long id) {
        return "服务熔断测试成功";
    }
}
