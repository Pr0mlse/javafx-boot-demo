package com.invoicing.entity;

public class Hero {
    private int id;
    private String name;
    private float hp;
    private int damage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
