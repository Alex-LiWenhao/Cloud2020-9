package com.alex.springcloud.myhandler;

import com.alex.springcloud.entities.CommonResult;
import com.alex.springcloud.entities.Payment;
import com.alibaba.csp.sentinel.slots.block.BlockException;


/**
 * @ClassName CustomerBlockHandler
 * @Description TODO :
 * @Author Alex
 * @Date 2020/10/25 21:15
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException blockException){
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 1",new Payment(2020L,"serial003"));

    }
    public static CommonResult handlerException2(BlockException blockException){
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 1",new Payment(2020L,"serial003"));

    }
}
