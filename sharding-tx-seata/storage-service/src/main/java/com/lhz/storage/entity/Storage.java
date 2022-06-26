package com.lhz.storage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author LiGezZ
 */
@Data
@TableName("tb_storage")
public class Storage {
    /**
     * 主键
     */
    private Long id;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 扣减数量
     */
    private Integer count;
}
