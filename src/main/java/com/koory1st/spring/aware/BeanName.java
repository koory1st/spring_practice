package com.koory1st.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class BeanName implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName:" + name);
    }
}
