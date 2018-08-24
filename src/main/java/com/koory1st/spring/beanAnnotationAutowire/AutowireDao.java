package com.koory1st.spring.beanAnnotationAutowire;

import org.springframework.stereotype.Repository;

@Repository
public class AutowireDao {
    public void say(String word) {
        System.out.println("AutowireDao:" + word);
    }
}
