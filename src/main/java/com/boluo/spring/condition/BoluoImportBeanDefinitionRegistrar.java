package com.boluo.spring.condition;

import com.boluo.spring.model.ImportBeanDefinitionRegistrarBean1;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class BoluoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param annotationMetadata 当前类的注解信息
     * @param beanDefinitionRegistry BeanDefinition注册类
     */
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        boolean person = beanDefinitionRegistry.containsBeanDefinition("person");
        if(person) {
            BeanDefinition beanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegistrarBean1.class);
            beanDefinitionRegistry.registerBeanDefinition("importBeanDefinitionRegistrarBean1", beanDefinition);
        }
    }
}
