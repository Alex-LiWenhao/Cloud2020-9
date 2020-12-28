package com.alex.springcloud.dao;

import com.alex.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/1 21:28
 * @Version 1.0
 */
@Mapper()
public interface OrderDao {
    /**
    *功能描述  新建订单
    * @author Alex
    * @Date 2020/11/1 21:31
    * @param order
    * @return int
    */
    int create(Order order);

    /**
    *功能描述 修改订单状态,从0改为1
    * @author Alex
    * @Date 2020/11/1 21:31
    * @param userId, status
    * @return int
    */
    int update(@Param("userId") Long userId, @Param("status") Integer status);
}
