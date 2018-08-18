package com.koory1st.spring.ioc.injection.dao;

public class InjectionDaoImpl implements InjectionDao {
    @Override
    public void save(String arg) {
        System.out.println("保存数据：" + arg);
    }
}
