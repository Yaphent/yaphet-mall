package com.yaphet.mall.member.dao;

import com.yaphet.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-11 10:53:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
