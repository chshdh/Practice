package com.neuedu.service;

import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;

import java.util.List;

public interface MilkService {

    public int updateMilk(Milk milk);
    public Rest<Milk> selectMilk(Integer currentPage, Integer pageSize);
    public  List<Milk> searchMilk(String milkName);
    public int insertMilk(Milk milk);
    public List<Milk> selectUser1();
    public int deleteMilkById(Integer order_id);
}
