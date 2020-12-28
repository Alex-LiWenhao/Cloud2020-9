package com.alex.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/11 22:59
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
