package com.neuedu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;
import com.neuedu.entity.product_order;
import com.neuedu.mapper.OrderMapper;
import com.neuedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public String getOrderWelcome() {
        return "welcome to phone_order";
    }

    @Override
    //public List<product_order> selectOrder() {
  //      return orderMapper.selectList(null);
    //}
    public Rest<product_order> selectOrder(Integer currentPage, Integer pageSize){
        Rest<product_order> rest = new Rest<>();
        IPage<product_order> page = new Page<product_order>();
        page.setCurrent(currentPage);
        page.setSize(pageSize);
        IPage<product_order> restPage = orderMapper.selectPage(page, null);
        //根据page变量的Current页码数和Size每页条数，得到List记录
        rest.setDataList(restPage.getRecords());
        //得到所有记录的条数
        rest.setTotal(restPage.getTotal());
        return rest;
    };

    @Override
    public int updateOrder(product_order order) {return orderMapper.updateById(order);}

    @Override
    public int insertOrder(product_order order){return orderMapper.insert(order);}
    @Override
    public int deleteOrderById(Integer order_id){return orderMapper.deleteById(order_id);}
    @Override
    public List<product_order> searchOrder(String customer_name){
        QueryWrapper<product_order> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("customer_name",customer_name);
        return orderMapper.selectList(queryWrapper);
    }
    @Override
    public product_order searchOrder1(Integer id)
    {
        return orderMapper.selectById(id);
    }


}
