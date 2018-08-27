package com.koory1st.spring.beanAnnotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

    @Bean(name="stringStore", initMethod = "init", destroyMethod = "destory")
    public StoreInterface stringStore() {
        return new StringStore();
    }
}
