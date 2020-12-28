package com.alex.springcloud.controller;

import com.alex.springcloud.domain.CommonResult;
import com.alex.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StorageController
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/2 23:28
 * @Version 1.0
 */
@RestController
@Slf4j
public class StorageController {
    @Autowired
    private StorageService storageService;

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(Long productId, Integer count){
        storageService.decrese(productId, count);
        return new CommonResult(200, "success");
    }

}
