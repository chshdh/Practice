package com.neuedu.controller;


import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;
import com.neuedu.entity.Script;
import com.neuedu.service.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ScriptController {
    @Autowired
    private ScriptService scriptService;

    @RequestMapping("/insertScript")
    public int insertScript(String scriptName, String scriptType, String scriptStatus, Integer scriptPrice)
    {
        Script script=new Script();
        script.setScriptName(scriptName);
        script.setScriptType(scriptType);
        script.setScriptPrice(scriptPrice);
        script.setScriptStatus(scriptStatus);
        return scriptService.insertScript(script);
    }
    @RequestMapping("/deleteScript")
    public String deleteScriptById(Integer scriptId)
    {
        scriptService.deleteScriptById(scriptId);
        return "删除"+scriptId+"号设备成功";
    }

    @RequestMapping("/searchScript")
    public Script searchScript(Integer scriptId)
    {
        return scriptService.searchScript(scriptId);
    }



   // @RequestMapping("/selectScript")
   // public List<Script> selectScript()
    //{
     //   return  scriptService.selectScript();
    //}

    @RequestMapping("/selectScript")

    public Rest<Script> selectScript(Integer currentPage, Integer pageSize){
        return scriptService.selectScript(currentPage,pageSize);
    }





    @RequestMapping("/updataScript")
    public int updataScript(Integer scriptId, String scriptName, String scriptType, String scriptStatus, Integer scriptPrice)
    {
        Script script=new Script();
        script.setScriptId(scriptId);
        script.setScriptName(scriptName);
        script.setScriptType(scriptType);
        script.setScriptPrice(scriptPrice);
        script.setScriptStatus(scriptStatus);
        return scriptService.updataScript(script);
    }

    @RequestMapping("/selectX")

    public List<Script> selectX(){
        return scriptService.searchScriptName("消毒");
    }

    @RequestMapping("/selectT")

    public List<Script> selectT(){
        return scriptService.searchScriptName("脱脂");
    }

    @RequestMapping("/selectF")

    public List<Script> selectF(){
        return scriptService.searchScriptName("发酵");
    }
    @RequestMapping("/selectG")

    public List<Script> selectG(){
        return scriptService.searchScriptName("罐装");
    }


}

