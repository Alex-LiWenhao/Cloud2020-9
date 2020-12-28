package com.alex.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StorageDao
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/2 22:57
 * @Version 1.0
 */
@Mapper
public interface StorageDao {
    int decrese(@Param("productId") Long productId, @Param("count")Integer count);
}
