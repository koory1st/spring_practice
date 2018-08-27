package com.koory1st.spring.beanAnnotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

    @Value("${url}")
    private String url;
    @Value("${userName}")
    private String userName;
    @Value("${password}")
    private String password;

    @Bean(name="stringStore", initMethod = "init", destroyMethod = "destory")
    public StoreInterface stringStore() {
        return new StringStore();
    }

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url, userName, password);
    }
}
