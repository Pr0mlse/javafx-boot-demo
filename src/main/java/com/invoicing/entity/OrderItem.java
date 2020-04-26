package com.invoicing.entity;

public class OrderItem {
    private int orderId;
    private int orderNum;
    private int id;
    private float orderUnivalence;
    private int orderCount;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getOrderUnivalence() {
        return orderUnivalence;
    }

    public void setOrderUnivalence(float orderUnivalence) {
        this.orderUnivalence = orderUnivalence;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId=" + orderId +
                ", orderNum=" + orderNum +
                ", id=" + id +
                ", orderUnivalence=" + orderUnivalence +
                ", orderCount=" + orderCount +
                '}';
    }
}
