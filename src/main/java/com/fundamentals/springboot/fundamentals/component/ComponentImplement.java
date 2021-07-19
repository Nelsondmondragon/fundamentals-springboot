package com.fundamentals.springboot.fundamentals.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{
    @Override
    public void greet() {
        System.out.println("hello from the component ");
    }
}
