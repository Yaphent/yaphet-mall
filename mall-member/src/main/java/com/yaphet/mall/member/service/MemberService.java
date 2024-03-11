package com.yaphet.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yaphet.mall.common.utils.PageUtils;
import com.yaphet.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-11 10:53:25
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

