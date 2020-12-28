package com.alex.springcloud.service.impl;

import com.alex.springcloud.dao.AccountDao;
import com.alex.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/3 12:33
 * @Version 1.0
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void decrease(Long userId, BigDecimal money) {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease(userId, money);
    }
}
