package com.boluo.spring.config;

import com.boluo.spring.model.BoluoAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwareConfig {

    @Bean
    public BoluoAware boluoAware() {
        return new BoluoAware();
    }
}
