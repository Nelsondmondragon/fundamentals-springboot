package com.fundamentals.springboot.fundamentals.bean;

public class MyBeanPropertiesImplement implements MyBeanWithProperties {

    private String name;
    private String surName;

    public MyBeanPropertiesImplement(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String function() {
        return name +" - " + surName;
    }
}
