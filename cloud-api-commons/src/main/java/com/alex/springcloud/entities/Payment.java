package com.alex.springcloud.entities;

/**
 * @ClassName Payment
 * @Description TODO :
 * @Author Alex
 * @Date 2020/9/26 21:45
 * @Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;


}
