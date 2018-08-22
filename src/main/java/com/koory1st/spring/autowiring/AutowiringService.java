package com.koory1st.spring.autowiring;

public class AutowiringService {
    public void setAutowiringDao(AutowiringDao autowiringDao) {
        this.autowiringDao = autowiringDao;
    }

    private AutowiringDao autowiringDao;


    public void say() {
        System.out.println("AutowiringService say");
        autowiringDao.say();
    }
}
