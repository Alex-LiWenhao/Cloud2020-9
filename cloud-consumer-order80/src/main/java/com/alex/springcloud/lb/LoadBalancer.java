package com.alex.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 *  LoadBalancer
 * @Description TODO :这个接口主要是为了获取当前访问的这个服务集群中有多少台服务器实例
 * @Author Alex
 * @Date 2020/10/6 22:11
 * @Version 1.0
 */

public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
