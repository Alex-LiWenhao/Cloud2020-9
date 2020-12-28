package com.alex.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8001
 * @Description TODO :
 * @Author Alex
 * @Date 2020/9/26 19:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.alex.springcloud.dao")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
