package com.lyq3.bigboot.upms.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyq3.bigboot.upms.api.DubboTestApi;
import org.springframework.stereotype.Controller;
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
