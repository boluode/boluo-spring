package com.boluo.spring.config;

import com.boluo.spring.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student() {
        return new Student();
    }

    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    public City city() {

        return new City();
    }

    @Bean
    public BoluoBeanPostProcessor boluoBeanPostProcessor() {
        return new BoluoBeanPostProcessor();
    }

    @Bean
    public BoluoApplicationContextAwareProcessor boluoApplicationContextAwareProcessor() {
        return new BoluoApplicationContextAwareProcessor();
    }
}
