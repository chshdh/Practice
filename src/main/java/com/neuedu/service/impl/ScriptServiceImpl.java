package com.neuedu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;
import com.neuedu.entity.Script;
import com.neuedu.mapper.ScriptMapper;
import com.neuedu.service.ScriptService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScriptServiceImpl implements ScriptService {
    @Autowired
    private ScriptMapper scriptMapper;
    public int insertScript(Script script) {return scriptMapper.insert(script);}

    public int deleteScriptById(Integer scriptId){return scriptMapper.deleteById(scriptId);}

    public Rest<Script> selectScript(Integer currentPage, Integer pageSize){
        Rest<Script> rest = new Rest<>();
        IPage<Script> page = new Page<Script>();
        page.setCurrent(currentPage);
        page.setSize(pageSize);
        IPage<Script> restPage = scriptMapper.selectPage(page, null);
        //根据page变量的Current页码数和Size每页条数，得到List记录
        rest.setDataList(restPage.getRecords());
        //得到所有记录的条数
        rest.setTotal(restPage.getTotal());
        return rest;
    }

    public Script searchScript(Integer scriptId){return scriptMapper.selectById(scriptId);}

    public int updataScript(Script script){return scriptMapper.updateById(script);}

    public List<Script> searchScriptName(String name)
    {
        QueryWrapper<Script> query = new QueryWrapper<>();
        query.like("script_type", name);
        return scriptMapper.selectList(query);
    }

}
