package com.koory1st.spring.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class KooryResource implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

    public void resource() throws IOException {
        // classpath
//        Resource resource = applicationContext.getResource("classpath:config.txt");
        //file
//        Resource resource = applicationContext.getResource("file:/Users/koory1st/dev/00_demoProject/spring_practice/src/main/resource/config.txt");
        //url
//        Resource resource = applicationContext.getResource("url:http://www.springframework.org/schema/beans/spring-beans-2.0.xsd");

        //依赖于applicationContext
        Resource resource = applicationContext.getResource("config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
