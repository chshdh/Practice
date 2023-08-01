package com.neuedu.controller;
import com.neuedu.commn.Rest;
import com.neuedu.entity.Milk;
import com.neuedu.entity.product_order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.service.OrderService;

import java.util.List;

@RestController
@CrossOrigin

public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping("/welcomeOrder")
    public String welcome() {
        String s = orderService.getOrderWelcome();
       return s;
    }

    //@RequestMapping("/selectOrder")
    //public List<product_order> selectUser(){
      //  return orderService.selectOrder();
    //}

    @RequestMapping("/selectOrder")

    public Rest<product_order> selectOrder(Integer currentPage, Integer pageSize){
        return orderService.selectOrder(currentPage,pageSize);
    }

    @RequestMapping("/updateOrder")
    public int updataOrder(int orderId, String productName, String productType, int productPrice, int productQuantity,
                            String customerName, String customerNumber, String customerAddress,
                           String orderStatus, String createTime, String completeTime){
        int totalAmount=productPrice*productQuantity;
        product_order order=new product_order(orderId,productName,productType,productPrice,productQuantity,
                totalAmount,customerName,customerNumber,customerAddress,orderStatus,createTime,completeTime);
        return orderService.updateOrder(order);
    }

    @RequestMapping("/insertOrder")
    public int insertOrder( Integer orderId, String productName, String productType, int productPrice, int productQuantity,
                            String customerName, String customerNumber, String orderStatus,String customerAddress, String createTime)
    {
        int totalAmount=productPrice*productQuantity;
        product_order order=new product_order();
        order.setOrderId(orderId);
        order.setProductName(productName);
        order.setProductType(productType);
        order.setProductPrice(productPrice);
        order.setProductQuantity(productQuantity);
        order.setCustomerName(customerName);
        order.setCustomerNumber(customerNumber);
        order.setCustomerAddress(customerAddress);
        order.setOrderStatus("未完成");
        order.setCreateTime(createTime);
        order.setTotalAmount(totalAmount);
        return orderService.insertOrder(order);
    }

    @RequestMapping("/deleteOrder")
    public String deleteOrderById(Integer orderId)
    {
        orderService.deleteOrderById(orderId);
        return "删除"+orderId+"号订单成功";
    };

    @RequestMapping("/searchOrder")
    public List<product_order>searchOrder(String customer_name)
    {
        return orderService.searchOrder(customer_name);
    }

    @RequestMapping("/searchOrder1")
    public product_order searchOrder1(Integer orderId)
    {
        return orderService.searchOrder1(orderId);
    }

}
