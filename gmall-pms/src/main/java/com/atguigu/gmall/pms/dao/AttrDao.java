package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhanglu
 * @email zhanglu@atguigu.com
 * @date 2020-05-27 20:51:06
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
