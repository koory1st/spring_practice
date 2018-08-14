package com.koory1st.spring.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String word) {
        return "oneInterface word:" + word;
    }
}
