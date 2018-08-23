package com.koory1st.spring.beanAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("bean")
@Component
@Scope("prototype")
public class BeanAnnotation {
    public void say(String word) {
        System.out.println("BeanAnnotation:" + word);
    }
}
