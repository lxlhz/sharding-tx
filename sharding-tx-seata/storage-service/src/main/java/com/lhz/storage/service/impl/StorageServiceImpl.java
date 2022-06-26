package com.lhz.storage.service.impl;

import com.lhz.storage.entity.Storage;
import com.lhz.storage.mapper.StorageMapper;
import com.lhz.storage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author LiGezZ
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    /**
     * 扣除存储数量
     *
     * @param orderId
     * @param count
     */
    @Override
    public void deduct(Long orderId, int count) {
        log.info("开始记录库存信息");
        try {
            long id = new Random().nextInt(999999999);
            Storage storage = new Storage();
            storage.setId(id);
            storage.setOrderId(orderId);
            storage.setCount(count);

            storageMapper.insert(storage);

            // 下游服务抛出异常
//             int a = 1 / 0;
        } catch (Exception e) {
            throw new RuntimeException("扣减库存失败，可能是库存不足！", e);
        }
        log.info("库存信息记录成功");
    }
}
