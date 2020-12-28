package com.alex.springcloud.service.impl;

import com.alex.springcloud.dao.PaymentMapper;
import com.alex.springcloud.entities.Payment;
import com.alex.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO :
 * @Author Alex
 * @Date 2020/9/26 22:06
 * @Version 1.0
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;



    /*public static void main(String[] args) {
        PaymentServiceImpl service = new PaymentServiceImpl();
        Payment payment = service.getPaymentById(Long.parseLong("1"));
    }*/

    @Override
    public int create(Payment payment) {


        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {

        return paymentMapper.getPaymentById(id);
    }
}
