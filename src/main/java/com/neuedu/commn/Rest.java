package com.neuedu.commn;


import java.util.List;

//统一返回类
public class Rest <T>{
    private List<T> dataList;
    private Long total;
    public Rest() {
        super();
    }
    public List<T> getDataList() {
        return dataList;
    }
    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
    public  Long getTotal() {
        return total;
    }
    public void setTotal( Long total) {
        this.total = total;
    }

}

