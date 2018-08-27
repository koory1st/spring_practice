package com.koory1st.spring.beanAnnotation;

import com.koory1st.spring.base.UnitTestBase;
import com.koory1st.spring.beanAnnotation.javabased.MyDriverManager;
import com.koory1st.spring.beanAnnotation.javabased.StoreInterface;
import com.koory1st.spring.beanAnnotation.javabased.jsr.JsrService;
import org.junit.Test;

public class TestJsr extends UnitTestBase {
    public TestJsr() {
        super("classpath:spring-bean-annotation.xml");
    }

    @Test
    public void testSave() {
        JsrService jsrService = super.getBean("jsrService");
        jsrService.save();
    }

}
