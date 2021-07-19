package com.fundamentals.springboot.fundamentals.bean;

public class MyBeanImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("hello from my implementation of the bean");
    }
}
