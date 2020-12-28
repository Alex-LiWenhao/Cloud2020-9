package com.alex.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyLB
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/6 22:12
 * @Version 1.0
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current>=2147483647 ? 0 : current+1;

        }while ( !atomicInteger.compareAndSet(current, next));
        System.out.println("------next:"+next);
        return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement()%serviceInstances.size();
        ServiceInstance serviceInstance = serviceInstances.get(index);
        return serviceInstance;
    }
}
