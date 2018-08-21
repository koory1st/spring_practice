package com.koory1st.spring.lifeCircle;

import com.koory1st.spring.base.UnitTestBase;
import com.koory1st.spring.lifeCircle.bean.BeanLifeCircle;
import org.junit.Test;

public class TestBeanLifeCircle extends UnitTestBase {
    public TestBeanLifeCircle() {
        super("classpath:spring-lifeCircle.xml");
    }

    @Test
    public void test1() {
        BeanLifeCircle beanLifeCircle = super.getBean("beanLifeCircle");
    }
}
