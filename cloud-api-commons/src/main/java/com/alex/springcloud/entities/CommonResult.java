package com.alex.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName CommonResult
 * @Description TODO :
 * @Author Alex
 * @Date 2020/9/26 21:48
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
