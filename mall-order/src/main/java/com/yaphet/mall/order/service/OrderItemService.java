package com.yaphet.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yaphet.mall.common.utils.PageUtils;
import com.yaphet.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-10 16:15:23
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

