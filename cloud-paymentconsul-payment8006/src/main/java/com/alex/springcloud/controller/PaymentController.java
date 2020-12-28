package com.alex.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/4 21:33
 * @Version 1.0
 */
@Slf4j
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentConsule(){
        return "springcloud with consul:" + serverPort + "\t"
                + UUID.randomUUID().toString();

    }
}
