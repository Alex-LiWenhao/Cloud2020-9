package com.alex.springcloud.service.impl;

import com.alex.springcloud.dao.StorageDao;
import com.alex.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StorageServiceImpl
 * @Description TODO :
 * @Author Alex
 * @Date 2020/11/2 23:23
 * @Version 1.0
 */
@Service
public class StorageServiceImpl implements StorageService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private StorageDao storageDao;
    @Override
    public int decrese(Long productId, Integer count) {
        return storageDao.decrese(productId, count);
    }
}
