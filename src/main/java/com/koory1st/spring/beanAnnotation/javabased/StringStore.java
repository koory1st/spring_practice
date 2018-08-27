package com.koory1st.spring.beanAnnotation.javabased;

public class StringStore implements StoreInterface {
    private void init() {
        System.out.println("init");
    }

    private void destory() {
        System.out.println("destory");
    }
}
