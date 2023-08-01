package com.neuedu.service;

import com.neuedu.commn.Rest;
import com.neuedu.controller.ProcessController;
import com.neuedu.entity.product_process;

import java.util.List;

public interface ProcessService {
    public Rest<product_process> selectProcess(Integer currentPage, Integer pageSize);
    public String showState(product_process process);
    public int upState(product_process process);
    public int insertProcess(product_process process);
    public int deleteProcessById(Integer process_id);
    public product_process searchProcess(Integer process_id);
}
