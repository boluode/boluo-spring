package com.boluo.spring.config;

import com.boluo.spring.condition.BoluoImportBeanDefinitionRegistrar;
import com.boluo.spring.condition.BoluoImportSelector;
import com.boluo.spring.condition.LinuxCondition;
import com.boluo.spring.condition.MacCondition;
import com.boluo.spring.model.Book;
import com.boluo.spring.model.Person;
import com.boluo.spring.model.Student;
import org.springframework.context.annotation.*;

@Configuration
@Import({Book.class, Student.class, BoluoImportSelector.class, BoluoImportBeanDefinitionRegistrar.class})
public class ScopeConfig {

    /**
     * Scope
     * prototype:原型
     * singleton:单例
     * request: 同一个请求 一个实例
     * session: 同一个session 一个实例
     */
    @Scope("prototype")
//    @Lazy
    @Bean
    public Person person() {
        System.out.println("给容器中添加Person...");
        return new Person("菠萝", 18);
    }

    /**
     * Conditional
     */
    @Conditional({MacCondition.class})
    @Bean
    public Person mac() {
        return new Person("mac", 29);
    }

    @Conditional({LinuxCondition.class})
    @Bean
    public Person linux() {
        return new Person("linux", 18);
    }
}
