package com.alex.springcloud.controller;

import com.alex.springcloud.domain.CommonResult;
import com.alex.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @ClassName AccountController
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/3 12:35
 * @Version 1.0
 */
@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 减余额
     * @param userId
     * @param money
     * @return
     */
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(Long userId, BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200, "减余额成功");
    }

}
