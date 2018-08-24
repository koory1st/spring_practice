package com.koory1st.spring.beanAnnotationAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutowireService {

//    @Autowired
    private AutowireDao autowireDao;

//    @Autowired
    public void setAutowireDao(AutowireDao autowireDao) {
        this.autowireDao = autowireDao;
    }

    @Autowired
    public AutowireService(AutowireDao autowireDao) {
        this.autowireDao = autowireDao;
    }

    public void say(String word) {
        autowireDao.say(word);
    }
}
