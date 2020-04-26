package com.invoicing.entity;

public class VendorItem {
    private int vendId;
    private int vendNum;
    private int id;
    private float vendUnivalence;
    private int vendCount;

    public int getVendId() {
        return vendId;
    }

    public void setVendId(int vendId) {
        this.vendId = vendId;
    }

    public int getVendNum() {
        return vendNum;
    }

    public void setVendNum(int vendNum) {
        this.vendNum = vendNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getVendUnivalence() {
        return vendUnivalence;
    }

    public void setVendUnivalence(float vendUnivalence) {
        this.vendUnivalence = vendUnivalence;
    }

    public int getVendCount() {
        return vendCount;
    }

    public void setVendCount(int vendCount) {
        this.vendCount = vendCount;
    }

    @Override
    public String toString() {
        return "vendorItem{" +
                "vendId=" + vendId +
                ", vendNum=" + vendNum +
                ", id=" + id +
                ", vendUnivalence=" + vendUnivalence +
                ", vendCount=" + vendCount +
                '}';
    }
}
