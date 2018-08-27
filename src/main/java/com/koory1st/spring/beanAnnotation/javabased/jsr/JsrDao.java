package com.koory1st.spring.beanAnnotation.javabased.jsr;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDao {

    public void save() {
        System.out.println("JsrDao is invoked");
    }
}
