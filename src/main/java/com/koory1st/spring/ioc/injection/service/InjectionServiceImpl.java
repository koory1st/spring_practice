package com.koory1st.spring.ioc.injection.service;

import com.koory1st.spring.ioc.injection.dao.InjectionDao;
import org.springframework.beans.factory.annotation.Autowired;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    @Override
    public void save(String arg) {
        System.out.println("Service接收参数：" + arg);
        arg += ":" + this.hashCode();
        injectionDao.save(arg);
    }
}
