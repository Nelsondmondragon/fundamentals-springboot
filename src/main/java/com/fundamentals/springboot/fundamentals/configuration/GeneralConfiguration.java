package com.fundamentals.springboot.fundamentals.configuration;

import com.fundamentals.springboot.fundamentals.bean.MyBeanPropertiesImplement;
import com.fundamentals.springboot.fundamentals.bean.MyBeanWithProperties;
import com.fundamentals.springboot.fundamentals.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.surname}")
    private String surName;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties function() {
        return new MyBeanPropertiesImplement(name, surName);
    }
}
