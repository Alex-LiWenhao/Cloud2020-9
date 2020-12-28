package com.alex.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain8001
 * @Description TODO :
 * @Author Alex
 * @Date 2020/9/26 19:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.alex.springcloud.dao")
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
