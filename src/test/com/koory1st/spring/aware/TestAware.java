package com.koory1st.spring.aware;

import com.koory1st.spring.base.UnitTestBase;
import com.koory1st.spring.lifeCircle.bean.BeanLifeCircle;
import org.junit.Test;

public class TestAware extends UnitTestBase {
    public TestAware() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void test1() {
        System.out.println(super.getBean("applicationContext").hashCode());
    }
}
