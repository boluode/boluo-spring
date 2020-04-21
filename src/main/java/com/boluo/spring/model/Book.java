package com.boluo.spring.model;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
public class Book implements InitializingBean, DisposableBean {

    public Book() {

        System.out.println("Book 构造方法");
    }

    public void afterPropertiesSet() throws Exception {

        System.out.println("Book afterPropertiesSet");
    }

    public void destroy() throws Exception {

        System.out.println("Book destroy");
    }
}
