package com.neuedu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class product_order {
    @TableId(type= IdType.AUTO)
    int orderId;
    String productName;
    String productType;
    int productPrice;
    int productQuantity;
    int totalAmount;
    String customerName;
    String customerNumber;
    String customerAddress;
    String orderStatus;
    String createTime;
    String completeTime;

    public product_order() {
    }

    public product_order(int orderId, String productName, String productType,
                         int productPrice, int productQuantity,int totalAmount, String customerName,
                         String customerNumber, String customerAddress, String orderStatus, String createTime, String completeTime) {
        this.orderId = orderId;
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.totalAmount = totalAmount;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.customerAddress = customerAddress;
        this.orderStatus = orderStatus;
        this.createTime = createTime;
        this.completeTime = completeTime;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }
}
