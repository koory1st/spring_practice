package com.koory1st.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContext implements ApplicationContextAware, BeanNameAware {
    private String beanName;
    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext:" + applicationContext.getBean(beanName).hashCode());
    }

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }
}
