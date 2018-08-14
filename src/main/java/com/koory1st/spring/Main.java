package com.koory1st.spring;

import com.koory1st.spring.ioc.interfaces.OneInterface;
import com.koory1st.spring.ioc.interfaces.OneInterfaceImpl;

public class Main {
    public static void main(String[] args) {
        OneInterface oif = new OneInterfaceImpl();

        System.out.println(oif.hello("hahaha"));
    }
}
