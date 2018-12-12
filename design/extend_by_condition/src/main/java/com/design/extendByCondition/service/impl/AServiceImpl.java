package com.design.extendByCondition.service.impl;

import com.design.extendByCondition.bean.SupportBean;
import com.design.extendByCondition.service.Service;
import org.springframework.stereotype.Component;

@Component
public class AServiceImpl implements Service {
    @Override
    public void execute() {
        System.out.println("A execute");
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public boolean isSupport(SupportBean supportBean) {

        return supportBean.getSupportNum() % 3 == 0;
    }
}
