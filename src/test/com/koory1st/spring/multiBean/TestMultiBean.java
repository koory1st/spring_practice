package com.koory1st.spring.multiBean;

import com.koory1st.spring.base.UnitTestBase;
import com.koory1st.spring.beanAnnotationAutowire.AutowireService;
import org.junit.Test;

public class TestMultiBean extends UnitTestBase {
    public TestMultiBean() {
        super("classpath:spring-multiBean.xml");
    }

    @Test
    public void test1() {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
        beanInvoker.say2();
        beanInvoker.say3();
    }

}
