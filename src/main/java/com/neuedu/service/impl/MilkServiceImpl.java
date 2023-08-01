package com.neuedu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;
import com.neuedu.mapper.MilkMapper;
import com.neuedu.service.MilkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MilkServiceImpl implements MilkService {
    @Autowired
    private MilkMapper milkMapper;
    @Override
    public int updateMilk(Milk milk)
    {
        return milkMapper.updateById(milk);
    }

    @Override
    public List<Milk> selectUser1(){
        return milkMapper.selectList(null);
    };
    @Override
    public Rest<Milk> selectMilk(Integer currentPage, Integer pageSize){
        Rest<Milk> rest = new Rest<>();
        IPage<Milk> page = new Page<Milk>();
        page.setCurrent(currentPage);
        page.setSize(pageSize);
        IPage<Milk> restPage = milkMapper.selectPage(page, null);
        //根据page变量的Current页码数和Size每页条数，得到List记录
        rest.setDataList(restPage.getRecords());
        //得到所有记录的条数
        rest.setTotal(restPage.getTotal());
        return rest;
    }

    @Override
     public List<Milk> searchMilk(String milkName){
        QueryWrapper<Milk> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("milk_name",milkName);
        return milkMapper.selectList(queryWrapper);
    }

    @Override
    public int insertMilk(Milk milk)
    {
        return milkMapper.insert(milk);
    }

    @Override
    public int deleteMilkById(Integer order_id)
    {
        return milkMapper.deleteById(order_id);
    }

}
