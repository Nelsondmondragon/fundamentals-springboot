package com.fundamentals.springboot.fundamentals.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("We have entered the method");
        LOGGER.debug("The number send as an argument to the operation dependency" + 1);
        System.out.println(myOperation.sum(1));
        System.out.println("Hello from implement of a bean with dependency");
    }
}
