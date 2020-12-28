package com.alex.springcloud.controller;

import com.alex.springcloud.entities.CommonResult;
import com.alex.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName PaymentController
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/25 21:38
 * @Version 1.0
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    public static HashMap<Long, Payment> map = new HashMap<>();
    static {
        map.put(1L,new Payment(1L,"1111"));
        map.put(1L,new Payment(2L,"2222"));
        map.put(1L,new Payment(3L,"3333"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult paymentSQL(@PathVariable("id") Long id){
        Payment payment = map.get(id);
        CommonResult<Payment> result = new CommonResult<>(200,"from mysql,serverPort: " + serverPort,payment);
        return result;
    }
}
