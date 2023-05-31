package com.khadri.spring.core;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanInstantiation {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Bean2 bean2 = beanFactory.getBean("bean2",Bean2.class);
    }
}
