package com.koory1st.spring.multiBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    public void say() {
        if (list == null) {
            System.out.println("BeanInvoker: list is null");
            return;
        }

        for (BeanInterface beanInterface : list) {
            System.out.println("BeanInvoker list:" + beanInterface.getClass().getName());
        }
    }

    public void say2() {
        if (map == null) {
            System.out.println("BeanInvoker: map is null");
            return;
        }

        for (Map.Entry<String, BeanInterface> stringBeanInterfaceEntry : map.entrySet()) {
            System.out.println("BeanInvoker map:" + stringBeanInterfaceEntry.getKey() + "," + stringBeanInterfaceEntry.getValue().getClass().getName());
        }
    }
}
