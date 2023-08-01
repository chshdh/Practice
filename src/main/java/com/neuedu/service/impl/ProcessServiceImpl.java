package com.neuedu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neuedu.commn.Rest;
import com.neuedu.controller.ProcessController;
import com.neuedu.entity.product_order;
import com.neuedu.entity.product_process;
import com.neuedu.mapper.ProcessMapper;
import com.neuedu.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessServiceImpl  implements ProcessService {
    @Autowired
    private ProcessMapper processMapper;
    public String showState(product_process process)
    {
        if(process.getProductType()=="纯牛奶")
            switch(process.getStage())
            {
                case 0:
                    return"未设定状态";
                case 1:
                    return"消毒";
                case 2:
                    return "罐装";
                case 3:
                    return "已结束";
            }
        else
            switch(process.getStage())
            {
                case 0:
                    return"未设定状态";
                case 1:
                    return"消毒";
                case 2:
                    return "发酵";
                case 3:
                    return "罐装";
                case 4:
                    return "已结束";
            }
        return"奶制品状态未选定，见ProcessServiceImpl";
    }
    public int upState(product_process process)
    {
    return processMapper.updateById(process);
    }

    public Rest<product_process> selectProcess(Integer currentPage, Integer pageSize){
        Rest<product_process> rest = new Rest<>();
        IPage<product_process> page = new Page<product_process>();
        page.setCurrent(currentPage);
        page.setSize(pageSize);
        IPage<product_process> restPage = processMapper.selectPage(page, null);
        //根据page变量的Current页码数和Size每页条数，得到List记录
        rest.setDataList(restPage.getRecords());
        //得到所有记录的条数
        rest.setTotal(restPage.getTotal());
        return rest;



    }

    public int insertProcess(product_process process)
    {
        return processMapper.insert(process);
    }

    public int deleteProcessById(Integer process_id)
    {
        return processMapper.deleteById(process_id);
    }

    public product_process searchProcess(Integer process_id)
    {
        return processMapper.selectById(process_id);
    }
}
