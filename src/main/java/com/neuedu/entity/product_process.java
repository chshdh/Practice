package com.neuedu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;


public class product_process {
    @TableId(type = IdType.AUTO)

    int orderId;               //该进程对应的订单号
    String productName;         //进程处理的产品名

    int scriptId;               //进程所用设备的id
    String scriptName;                //进程所用设备的名字
    public int stage;                //该批牛奶的阶段：/纯牛奶：消毒，罐装/酸牛奶：消毒，发酵，罐装
    String productType;        //牛奶的类型：酸牛奶，纯牛奶
    String stageStatement;

    public product_process() {
    }

    public product_process(int orderId, String productName, int scriptId, String scriptName, int stage,
                           String productType) {
        this.orderId = orderId;
        this.productName = productName;
        this.scriptId = scriptId;
        this.scriptName = scriptName;
        this.stage = stage;
        this.productType = productType;
        this.stageStatement = "未加工";
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getScriptId() {
        return scriptId;
    }

    public void setScriptId(int scriptId) {
        this.scriptId = scriptId;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getStageStatement() {
        return stageStatement;
    }

    public void setStageStatement(String stageStatement) {
        this.stageStatement = stageStatement;
    }


}
