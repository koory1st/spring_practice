package com.koory1st.spring.beanAnnotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

//    @Value("${url}")
//    private String url;
//    @Value("${userName}")
//    private String userName;
//    @Value("${password}")
//    private String password;
//
//    @Bean(name="stringStore", initMethod = "init", destroyMethod = "destory")
//    @Scope(value = "prototype", proxyMode = ScopedProxyMode.DEFAULT)
//    public StoreInterface stringStore() {
//        return new StringStore();
//    }
//
//    @Bean
//    public MyDriverManager myDriverManager() {
//        return new MyDriverManager(url, userName, password);
//    }

    @Autowired
    @Qualifier(value = "stringStore")
    private StoreInterface<String> s1;

    @Autowired
    @Qualifier(value = "integerStore")
    private StoreInterface<Integer> s2;


    @Bean
    public StringStore stringStore() {
        return new StringStore();
    }
    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }


    @Bean(value = "stringStoreTest")
    public StringStore stringStoreTest() {
        System.out.println("s1:" + s1.getClass().getName());
        System.out.println("s2:" + s2.getClass().getName());

        return new StringStore();
    }
}
