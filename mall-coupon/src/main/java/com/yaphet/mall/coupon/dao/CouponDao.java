package com.yaphet.mall.coupon.dao;

import com.yaphet.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-10 16:28:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
