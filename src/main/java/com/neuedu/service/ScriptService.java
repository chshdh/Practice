package com.neuedu.service;

import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;
import com.neuedu.entity.Script;

import java.util.List;

public interface ScriptService {
    public int insertScript(Script script);
    public int deleteScriptById(Integer scriptId);
    public Rest<Script> selectScript(Integer currentPage, Integer pageSize);
    public Script searchScript(Integer scriptId);

    public List<Script> searchScriptName(String name);
    public int updataScript(Script script);
}
