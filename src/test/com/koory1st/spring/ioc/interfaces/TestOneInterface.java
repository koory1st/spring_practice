package com.koory1st.spring.ioc.interfaces;

import com.koory1st.spring.base.UnitTestBase;
import com.koory1st.spring.ioc.injection.service.InjectionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    public TestOneInterface() {
        super("classpath:spring-*.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterFace");
        String helloString = oneInterface.hello("heheh");
        System.out.println(helloString);


    }

    @Test
    public void testInjection() {
        InjectionServiceImpl injectionService = super.getBean("injectionService");
        injectionService.save("hahahah");
    }
}
