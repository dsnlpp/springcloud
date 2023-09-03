package com.lpp.springcloud.service;/*

@author shkstart

@create 2023-08-12 22:03

*/

import com.lpp.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentDaoService {

    Payment queryById(@Param("id") int id);

    int savePayment(Payment payment);

}
