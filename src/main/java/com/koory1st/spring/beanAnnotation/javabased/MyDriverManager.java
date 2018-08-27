package com.koory1st.spring.beanAnnotation.javabased;

public class MyDriverManager {
    public MyDriverManager(String url, String userName, String password) {
        System.out.println("url:" + url);
        System.out.println("userName:" + userName);
        System.out.println("password:" + password);
    }
}
