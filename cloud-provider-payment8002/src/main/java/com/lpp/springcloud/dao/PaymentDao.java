package com.lpp.springcloud.dao;/*

@author shkstart

@create 2023-08-12 21:23

*/

import com.lpp.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int insert(Payment payment);

    Payment queryByIdPayment(@Param("id") int id);
}