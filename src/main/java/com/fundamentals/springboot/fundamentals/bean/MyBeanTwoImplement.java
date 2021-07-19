package com.fundamentals.springboot.fundamentals.bean;

public class MyBeanTwoImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("Hello from my implementation two of the bean");
    }
}
