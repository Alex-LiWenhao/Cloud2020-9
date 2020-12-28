package com.alex.springcloud.service.impl;

import com.alex.springcloud.dao.OrderDao;
import com.alex.springcloud.domain.Order;
import com.alex.springcloud.service.AccountService;
import com.alex.springcloud.service.OrderService;
import com.alex.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/1 22:03
 * @Version 1.0
 */
@SuppressWarnings("ALL")
@Service("orderService")
@Slf4j

public class OrderServiceImpl implements OrderService {
    @Autowired
    private AccountService accountService;
    @Autowired
    private StorageService storageService;
    @Autowired
    private OrderDao orderDao;
    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说:
     * 下订单->减库存->减余额->改状态
     * GlobalTransactional seata开启分布式事务,异常时回滚,name保证唯一即可
     * @param order 订单对象
     */
    @Override
    @GlobalTransactional(name = "alex-create-order" ,rollbackFor = Exception.class)
    public void create(Order order) {
        // 1 新建订单
        log.info("开始新建订单");
        orderDao.create(order);
        // 2 扣减库存
        log.info("开始减库存");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("减库存结束");
        // 3 扣减账户
        log.info("开始扣除账户金额");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("扣除金额结束");
        // 4 修改订单状态,从0到1,1代表已完成
        orderDao.update(order.getUserId(), 0);
        log.info("新建订单结束");
    }
}
