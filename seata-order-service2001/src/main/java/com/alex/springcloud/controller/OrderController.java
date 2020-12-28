package com.alex.springcloud.controller;

import com.alex.springcloud.domain.CommonResult;
import com.alex.springcloud.domain.Order;
import com.alex.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/1 22:02
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "创建订单成功");
    }

}
