package com.fundamentals.springboot.fundamentals.bean;

public class MyOperationImplement implements MyOperation {
    @Override
    public int sum(int number) {
        return number + 2;
    }
}