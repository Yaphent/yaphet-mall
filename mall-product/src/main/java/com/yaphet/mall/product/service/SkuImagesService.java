package com.yaphet.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yaphet.mall.common.utils.PageUtils;
import com.yaphet.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-10 11:24:21
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

