package com.koory1st.spring.aop;

import com.koory1st.spring.aop.schema.advice.biz.AspectBiz;
import com.koory1st.spring.autowiring.AutowiringService;
import com.koory1st.spring.base.UnitTestBase;
import org.junit.Test;

public class TestAspect extends UnitTestBase {
    public TestAspect() {
        super("classpath:spring-aop-schema-advice.xml");
    }

    @Test
    public void test1() {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.biz();
    }
    @Test
    public void testInit() {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.init("aaaaa", 2);
    }
}
