package com.boluo.spring.config;

import com.boluo.spring.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

import static org.junit.Assert.*;

public class ScopeConfigTest {

    private AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(ScopeConfig.class);
    }

    @Test
    public void test() {

        System.out.println("IOC容器创建完成....");
        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println(person1 == person2);
        context.close();
    }

    @Test
    public void testCondition() {

        System.out.println("IOC容器创建完成....");

        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println("当前操作系统的名称" + environment.getProperty("os.name"));

        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        System.out.println("***************************************");
        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }
}
