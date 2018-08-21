package com.koory1st.spring.lifeCircle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCircle implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean init");

    }
//    private void start() {
//        System.out.println("bean start");
//    }
//
//    private void stop() {
//        System.out.println("bean stop");
//    }
}
