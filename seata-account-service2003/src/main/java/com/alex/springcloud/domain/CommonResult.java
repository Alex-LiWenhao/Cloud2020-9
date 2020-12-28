package com.alex.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/3 10:28
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
