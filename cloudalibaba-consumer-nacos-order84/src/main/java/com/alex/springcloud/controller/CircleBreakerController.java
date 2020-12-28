package com.alex.springcloud.controller;

import com.alex.springcloud.entities.CommonResult;
import com.alex.springcloud.entities.Payment;
import com.alex.springcloud.service.PaymentFallbackService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName CircleBreakerController
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/25 21:56
 * @Version 1.0
 */
@RestController
@Slf4j
public class CircleBreakerController {
    public static  final  String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

    private PaymentFallbackService service;

    @RequestMapping("/consumer/fallback/{id}")
   /* @SentinelResource(value = "fallback",blockHandler = "blockHandler",fallback = "handlerFallback")*/
    @SentinelResource(value = "fallback"
    )
    public CommonResult<Payment> fallback(@PathVariable Long id) {
       // CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, CommonResult.class,id);
        CommonResult<Payment> result = service.paymentSQL(id);

        if(id == 4){
            throw new IllegalArgumentException("IllegalArgument ,非法参数异常...");
        }else if(result.getData() == null) {
            throw new NullPointerException("NullPointerException,该ID没有对应记录，空指针异常");
        }

        return  result;
    }


    public CommonResult handlerFallback(@PathVariable Long id,Throwable e) {
        Payment payment = new Payment(id,"null");
        return new CommonResult(444,"异常handlerFallback，exception内容： " + e.getMessage(), payment);
    }


    public CommonResult blockHandler(@PathVariable Long id, BlockException e) {
        Payment payment = new Payment(id,"null");
        return new CommonResult(444,"blockHandler-sentinel 限流，BlockException： " + e.getMessage(), payment);
    }


}
