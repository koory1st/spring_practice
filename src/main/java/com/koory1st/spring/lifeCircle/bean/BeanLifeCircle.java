package com.koory1st.spring.lifeCircle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCircle {
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("bean destroy");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("bean init");
//
//    }
//    private void start() {
//        System.out.println("bean start");
//    }
//
//    private void stop() {
//        System.out.println("bean stop");
//    }


    private void defaultInitMethod() {
        System.out.println("bean defaultInitMethod");
    }

    private void defaultDestroyMethod() {
        System.out.println("bean defaultDestroyMethod");
    }
}
