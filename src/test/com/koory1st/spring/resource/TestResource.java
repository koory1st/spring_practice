package com.koory1st.spring.resource;

import com.koory1st.spring.autowiring.AutowiringService;
import com.koory1st.spring.base.UnitTestBase;
import org.junit.Test;

import java.io.IOException;

public class TestResource extends UnitTestBase {
    public TestResource() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void test1() throws IOException {
        KooryResource resource = super.getBean("kooryResource");
        resource.resource();
    }
}
