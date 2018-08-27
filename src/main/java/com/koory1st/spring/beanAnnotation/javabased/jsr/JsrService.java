package com.koory1st.spring.beanAnnotation.javabased.jsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {

//    @Resource
    private JsrDao jsrDao;

    @Resource
    public void setJsrDao(JsrDao jsrDao) {
        this.jsrDao = jsrDao;
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    @PreDestroy
    public void destory() {
        System.out.println("destory");
    }

    public void save() {
        jsrDao.save();
    }
}
