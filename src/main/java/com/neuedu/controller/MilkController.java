package com.neuedu.controller;

import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;
import com.neuedu.service.MilkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MilkController {
    @Autowired
    private MilkService milkService;


    @RequestMapping("/selectMilk")

    public Rest<Milk> selectUser(Integer currentPage, Integer pageSize){
        return milkService.selectMilk(currentPage,pageSize);
    }

    @RequestMapping("/selectMilk1")

    public List<Milk> selectUser(){
        return milkService.selectUser1();
    }
    @RequestMapping("/searchMilk")
    public  List<Milk> searchMilk(String milkName)
    {
        return milkService.searchMilk(milkName);
    }

    @RequestMapping("/updataMilk")
    public int updateOrder(Integer milkId,String milkName, String milkType,Integer milkPrice)
    {
        Milk milk=new Milk();
        milk.setMilkId(milkId);
        milk.setMilkName(milkName);
        milk.setMilkType(milkType);
        milk.setMilkPrice(milkPrice);
        return milkService.updateMilk(milk);

    }
    @RequestMapping("/insertMilk")
    public int insertOrder(String milkName, String milkType,Integer milkPrice)
    {
        Milk milk=new Milk();
        milk.setMilkName(milkName);
        milk.setMilkType(milkType);
        milk.setMilkPrice(milkPrice);
        return milkService.insertMilk(milk);

    }

    @RequestMapping("/deleteMilk")
    public int deleteMilkById(Integer milkId)
    {
        return milkService.deleteMilkById(milkId);
    }
}
