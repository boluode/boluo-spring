package com.boluo.spring.model;

import org.springframework.beans.factory.FactoryBean;

public class BoluoFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        System.out.println("BoluoFactoryBean getObject()");
        return new Person();
    }

    public Class<?> getObjectType() {
        return Person.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
