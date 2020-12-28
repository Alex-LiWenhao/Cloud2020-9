package com.alex.springcloud.service.impl;

import com.alex.springcloud.entities.CommonResult;
import com.alex.springcloud.entities.Payment;
import com.alex.springcloud.service.PaymentFallbackService;

/**
 * @ClassName PaymentFallbackServiceImpl
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/25 22:23
 * @Version 1.0
 */
public class PaymentFallbackServiceImpl implements PaymentFallbackService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));

    }
}
