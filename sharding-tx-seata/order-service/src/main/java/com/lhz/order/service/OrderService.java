package com.lhz.order.service;

import com.lhz.order.entity.Order;

/**
 * @author LiGezZ
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    Long create(Order order);
}