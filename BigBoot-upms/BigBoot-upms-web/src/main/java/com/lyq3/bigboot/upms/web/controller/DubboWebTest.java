package com.lyq3.bigboot.upms.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyq3.bigboot.upms.api.DubboTestApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboWebTest {
    @Reference
    private DubboTestApi dubboTestApi;
    @GetMapping("/test")
    public void test(){
        dubboTestApi.test();
    }
}
