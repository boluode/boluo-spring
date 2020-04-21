package com.boluo.spring.model;

public class Student {

    public Student() {

        System.out.println("Student 构造方法");
    }

    public void init() {

        System.out.println("Student 初始化方法");
    }

    public void destroy() {

        System.out.println("Student 销毁方法");
    }
}
