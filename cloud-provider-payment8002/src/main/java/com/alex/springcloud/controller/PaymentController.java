package com.alex.springcloud.controller;

import com.alex.springcloud.entities.CommonResult;
import com.alex.springcloud.entities.Payment;
import com.alex.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentController
 * @Description TODO :
 * @Author Alex
 * @Date 2020/9/26 22:08
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping(value="/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result  = paymentService.create(payment);
        log.info("插入结果"+result);
        if(result > 0){
            return new CommonResult(200, "插入成功"+port, result);
        }else {
            return new CommonResult(444, "插入失败", result);
        }

    }

    @GetMapping(value="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****插入结果:" + payment);

        if(payment != null){
            return  new CommonResult(200,"查询成功"+port,payment);
        } else {
            return new CommonResult(444,"没有对应记录，查询ID: " + id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return port;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return port;
        }
    }

}
