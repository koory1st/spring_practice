package com.koory1st.spring.beanAnnotationAutowire;

import com.koory1st.spring.base.UnitTestBase;
import com.koory1st.spring.beanAnnotation.BeanAnnotation;
import org.junit.Test;

public class TestBeanAnnotationAutowire extends UnitTestBase {
    public TestBeanAnnotationAutowire() {
        super("classpath:spring-beanAnnotationAutowire.xml");
    }

    @Test
    public void test1() {
        AutowireService autoWireService = super.getBean("autowireService");
        autoWireService.say("hahah");
    }

}
