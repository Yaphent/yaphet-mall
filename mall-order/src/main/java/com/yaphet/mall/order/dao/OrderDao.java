package com.yaphet.mall.order.dao;

import com.yaphet.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-10 16:15:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
