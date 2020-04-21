package com.boluo.spring.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class BoluoAware implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setBeanName(String name) {
        System.out.println("当前Bean的名字：" + name);
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {

        System.out.println(resolver.resolveStringValue("当前操作系统${os.name}"));
    }
}
