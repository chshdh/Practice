package com.neuedu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Script {
    @TableId(type = IdType.AUTO)
    Integer scriptId;
    String scriptName;
    String scriptType;
    String scriptStatus;
    Integer scriptPrice;

    public Script() {
    }

    public Script(Integer scriptId, String scriptName, String scriptType, String scriptStatus, Integer scriptPrice) {
        this.scriptId = scriptId;
        this.scriptName = scriptName;
        this.scriptType = scriptType;
        this.scriptStatus = scriptStatus;
        this.scriptPrice = scriptPrice;
    }

    public Integer getScriptId() {
        return scriptId;
    }

    public void setScriptId(Integer scriptId) {
        this.scriptId = scriptId;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public String getScriptType() {
        return scriptType;
    }

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    public String getScriptStatus() {
        return scriptStatus;
    }

    public void setScriptStatus(String scriptStatus) {
        this.scriptStatus = scriptStatus;
    }

    public Integer getScriptPrice() {
        return scriptPrice;
    }

    public void setScriptPrice(Integer scriptPrice) {
        this.scriptPrice = scriptPrice;
    }
}
