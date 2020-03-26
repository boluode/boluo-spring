package com.boluo.spring.config;

import com.boluo.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {

    /**
     * Scope
     * prototype:原型
     * singleton:单例
     * request: 同一个请求 一个实例
     * session: 同一个session 一个实例
     */
//    @Scope("prototype")
    @Lazy
    @Bean
    public Person person() {
        System.out.println("给容器中添加Person...");
        return new Person("菠萝", 18);
    }
}
