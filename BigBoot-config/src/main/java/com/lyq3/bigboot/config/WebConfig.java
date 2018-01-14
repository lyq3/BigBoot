package com.lyq3.bigboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

/**
 * Web配置类
 * @author 卡卢比
 */
@Configuration
public class WebConfig {

//    @Bean
//    public FilterRegistrationBean xssFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setDispatcherTypes(DispatcherType.REQUEST);
////        registration.setFilter(new XssFilter());
////        registration.addUrlPatterns("/*");
////        registration.setName("xssFilter");
////        registration.setOrder(Integer.MAX_VALUE);
//        return registration;
//    }
}
