package com.alex.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Account
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/3 10:29
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    private Long id;
    private Long userId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
