package com.koory1st.spring.ioc.interfaces;

import com.koory1st.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    public TestOneInterface() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterFace");
        String helloString = oneInterface.hello("heheh");
        System.out.println(helloString);
    }
}
