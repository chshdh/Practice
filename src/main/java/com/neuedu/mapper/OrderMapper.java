package com.neuedu.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.neuedu.entity.product_order;

@Mapper
public interface OrderMapper extends BaseMapper<product_order> {

}