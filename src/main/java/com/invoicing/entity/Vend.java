package com.invoicing.entity;

import java.util.Date;

public class Vend {
    private int vendId;
    private Date vendTime;
    private float vendCost;

    public int getVendId() {
        return vendId;
    }

    public void setVendId(int vendId) {
        this.vendId = vendId;
    }

    public Date getVendTime() {
        return vendTime;
    }

    public void setVendTime(Date vendTime) {
        this.vendTime = vendTime;
    }

    public float getVendCost() {
        return vendCost;
    }

    public void setVendCost(float vendCost) {
        this.vendCost = vendCost;
    }

    @Override
    public String toString() {
        return "vend{" +
                "vendId=" + vendId +
                ", vendTime=" + vendTime +
                ", vendCost=" + vendCost +
                '}';
    }
}
