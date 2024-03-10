package com.yaphet.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yaphet.mall.common.utils.PageUtils;
import com.yaphet.mall.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-10 16:33:07
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

