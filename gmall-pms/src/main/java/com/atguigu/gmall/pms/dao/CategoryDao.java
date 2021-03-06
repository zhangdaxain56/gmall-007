package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhanglu
 * @email zhanglu@atguigu.com
 * @date 2020-05-27 20:51:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
