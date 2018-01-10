package com.lyq3.bigboot.common.proxy;

import com.lyq3.bigboot.common.annotation.Http;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;

/**
 * 这个Bean创建时自动执行init方法 使用Reflections扫描工程里面属于带Rest注解的接口。
 */
@Component
public class RestUtilInit implements BeanDefinitionRegistryPostProcessor {
    @Autowired
    RequestHandle requestHandle;

//    @PostConstruct
//    public void init() {
//        Set<Class<?>> requests = new Reflections("com.lyq3").getTypesAnnotatedWith(Http.class);
//        for (Class<?> cls : requests) {
//            createProxyClass(cls);
//        }
//
//    }这个类未完成，不应该实现BeanDefinitionRegistryPostProcessor，有时间再改

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
