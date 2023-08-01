package com.neuedu.service;

import java.util.List;

import com.neuedu.commn.Rest;
import com.neuedu.entity.product_order;
public interface OrderService {
    public String getOrderWelcome();

    public Rest<product_order> selectOrder(Integer currentPage, Integer pageSize);
    public int updateOrder(product_order order);
    public int insertOrder(product_order order);
    public int deleteOrderById(Integer order_id);
    public List<product_order> searchOrder(String customer_name);
    public product_order searchOrder1(Integer id);
}
