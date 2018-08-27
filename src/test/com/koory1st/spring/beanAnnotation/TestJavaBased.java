package com.koory1st.spring.beanAnnotation;

import com.koory1st.spring.base.UnitTestBase;
import com.koory1st.spring.beanAnnotation.javabased.MyDriverManager;
import com.koory1st.spring.beanAnnotation.javabased.StoreInterface;
import org.junit.Test;

public class TestJavaBased extends UnitTestBase {
    public TestJavaBased() {
        super("classpath:spring-bean-annotation.xml");
    }

    @Test
    public void test1() {
        StoreInterface store = super.getBean("stringStore");

        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManager() {
        MyDriverManager myDriverManager = super.getBean("myDriverManager");

        System.out.println(myDriverManager.getClass().getName());
    }
}
