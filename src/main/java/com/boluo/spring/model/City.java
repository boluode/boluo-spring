package com.boluo.spring.model;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
public class City {

    public City() {

        System.out.println("City 构造方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("City PostConstruct ");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("City PreDestroy ");
    }
}
