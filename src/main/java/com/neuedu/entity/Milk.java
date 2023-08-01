package com.neuedu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Milk {
    @TableId(type= IdType.AUTO)
    Integer milkId;
    String milkName;
    String milkType;

    Integer milkPrice;


    public Milk() {
    }

    public Milk(Integer milkId, String milkName, String milkType, Integer milkPrice) {
        this.milkId = milkId;
        this.milkName = milkName;
        this.milkType = milkType;
        this.milkPrice = milkPrice;
    }

    public Integer getMilkId() {
        return milkId;
    }

    public void setMilkId(Integer milkId) {
        this.milkId = milkId;
    }

    public String getMilkName() {
        return milkName;
    }

    public void setMilkName(String milkName) {
        this.milkName = milkName;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public Integer getMilkPrice() {
        return milkPrice;
    }

    public void setMilkPrice(Integer milkPrice) {
        this.milkPrice = milkPrice;
    }
}
