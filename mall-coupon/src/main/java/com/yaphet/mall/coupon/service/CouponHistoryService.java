package com.yaphet.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yaphet.mall.common.utils.PageUtils;
import com.yaphet.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-10 16:28:08
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

