package com.boluo.spring.config;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareConfigTest {

    private AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(AwareConfig.class);
    }

    @Test
    public void test1() {

    }

    @After
    public void after() {
        context.close();
    }
}
