package com.alex.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @ClassName AccountDao
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/3 10:33
 * @Version 1.0
 */
@Mapper()
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
