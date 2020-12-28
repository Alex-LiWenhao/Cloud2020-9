package com.alex.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentConsul8006
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/4 21:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8006 .class, args);
    }
}
