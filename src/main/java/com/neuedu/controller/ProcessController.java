package com.neuedu.controller;

import com.neuedu.commn.Rest;
import com.neuedu.entity.Script;
import com.neuedu.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neuedu.entity.product_process;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin
public class ProcessController {
    @Autowired
    private ProcessService processService;
//    @RequestMapping("/selectProcess")
//    public List<product_process> selectProcess()
//    {
//        return processService.selectProcess();
//
//    }
    @RequestMapping("/selectProcess")

    public Rest<product_process> selectProcess(Integer currentPage, Integer pageSize){
        return processService.selectProcess(currentPage,pageSize);
    }







    @RequestMapping("/insertProcess")
    public int insertProcess( int orderId, String productName, String productType)
    {
    product_process process=new product_process();
    process.setOrderId(orderId);
    process.setProductName(productName);
    process.setScriptId(-1);
    process.setScriptName(null);
    process.setStage(1);
    process.setProductType(productType);
    return processService.insertProcess(process);
    }

    @RequestMapping("/updateProcess")
    public int upState(int orderId, String productName, int scriptId, String scriptName, int stage, String productType)
    {
        product_process process=new product_process(orderId,productName,scriptId,scriptName,stage,productType);
        if(stage==2)process.setStageStatement("消毒");
        else if(stage==3)process.setStageStatement("脱脂");
        else if(stage==4&& Objects.equals(productType, "纯牛奶"))process.setStageStatement("罐装");
        else if(stage==4&& Objects.equals(productType, "酸奶"))process.setStageStatement("发酵");
        else process.setStageStatement("罐装");
        return processService.upState(process);
    }

    @RequestMapping("/deleteProcess")
    public String deleteProcessById(Integer orderId)
    {
        processService.deleteProcessById(orderId);
        return "删除"+orderId+"号进程成功";
    }
    @RequestMapping("/searchProcess")
    public product_process searchProcess(Integer orderId)
    {
        return processService.searchProcess(orderId);
    }


}

