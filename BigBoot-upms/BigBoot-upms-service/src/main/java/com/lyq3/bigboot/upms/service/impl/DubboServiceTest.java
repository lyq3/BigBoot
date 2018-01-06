package com.lyq3.bigboot.upms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyq3.bigboot.upms.api.DubboTestApi;

@Service
public class DubboServiceTest implements DubboTestApi{
    @Override
    public void test() {
        System.out.println("\n==============Dubbo-Service测试成功==========\n");
    }
}
