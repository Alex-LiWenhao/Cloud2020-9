package com.alex.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Storage
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/2 18:55
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Storage {
    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
