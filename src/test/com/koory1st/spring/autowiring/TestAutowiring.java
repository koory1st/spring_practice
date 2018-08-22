package com.koory1st.spring.autowiring;

import com.koory1st.spring.base.UnitTestBase;
import org.junit.Test;

public class TestAutowiring extends UnitTestBase {
    public TestAutowiring() {
        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void test1() {
        AutowiringService autowiringService = super.getBean("autowiringService");
        autowiringService.say();
    }
}
