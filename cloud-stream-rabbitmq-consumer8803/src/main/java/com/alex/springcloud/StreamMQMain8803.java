package com.alex.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName StreamMQMain8803
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/17 17:55
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8803.class, args);
    }

}
