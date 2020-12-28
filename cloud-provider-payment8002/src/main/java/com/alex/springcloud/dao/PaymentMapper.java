package com.alex.springcloud.dao;

import com.alex.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description TODO :
 * @Author Alex
 * @Date 2020/9/26 21:50
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);
    //@Select("select * from payment where id= #{id}")
    public Payment getPaymentById( @Param("id") Long id);
}
