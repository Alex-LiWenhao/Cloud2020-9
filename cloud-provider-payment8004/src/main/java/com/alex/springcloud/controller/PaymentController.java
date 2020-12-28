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
 * @Date 2020/10/3 20:19
 * @Version 1.0
 */
@Slf4j
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/zk")
    public String paymentzk(){

        return "springcloud with zookeeper:" + port + "\t"
                + UUID.randomUUID().toString();


    }

}
