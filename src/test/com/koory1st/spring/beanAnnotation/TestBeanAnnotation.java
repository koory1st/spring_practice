package com.koory1st.spring.beanAnnotation;

import com.koory1st.spring.autowiring.AutowiringService;
import com.koory1st.spring.base.UnitTestBase;
import org.junit.Test;

public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation() {
        super("classpath:spring-bean-annotation.xml");
    }

    @Test
    public void test1() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("hahah");
    }

    @Test
    public void testScope() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        System.out.println("beanAnnotation1:" + beanAnnotation.hashCode());

        beanAnnotation = super.getBean("beanAnnotation");
        System.out.println("beanAnnotation2:" + beanAnnotation.hashCode());
    }

    @Test
    public void testG() {
        super.getBean("stringStoreTest");
    }
}
