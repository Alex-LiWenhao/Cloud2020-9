package com.alex.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/1 22:24
 * @Version 1.0
 */
@Configuration
@MapperScan("com.alex.springcloud.dao")
public class MyBatisConfig {
}
