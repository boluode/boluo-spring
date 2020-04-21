package com.boluo.spring.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BoluoBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("BoluoBeanPostProcessor postProcessBeforeInitialization... bean:" + bean + "  beanName:" + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BoluoBeanPostProcessor postProcessAfterInitialization... bean:" + bean + "  beanName:" + beanName);
        return bean;
    }
}
