package com.alex.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/4 22:12
 * @Version 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
