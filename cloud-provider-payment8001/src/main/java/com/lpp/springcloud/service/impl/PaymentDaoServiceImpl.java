package com.lpp.springcloud.service.impl;/*

@author shkstart

@create 2023-08-12 22:06

*/

import com.lpp.springcloud.dao.PaymentDao;
import com.lpp.springcloud.entities.Payment;
import com.lpp.springcloud.service.PaymentDaoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class PaymentDaoServiceImpl implements PaymentDaoService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment queryById(@Param("id") int id) {
        return paymentDao.queryByIdPayment(id);
    }

    @Override
    public int savePayment(Payment payment) {
        return paymentDao.insert(payment);
    }
}
