package com.lyq3.bigboot.common.proxy;

import com.lyq3.bigboot.common.annotation.Http;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 这个Bean创建时自动执行init方法 扫描工程里面属于带@Http注解的接口。
 */
@Component
public class RestUtilInit extends  ClassPathScanningCandidateComponentProvider{
//    @Autowired
//    RequestHandle requestHandle;
        @Autowired
        Environment environment;

    public RestUtilInit() {
        super(true);//调用父类构造方法初始化
    }
//2018/1/14注：下面扫描类的、式不能实现，只能扫描@Component注解的类，有时间再研究、
    @PostConstruct
    public void init() {
        super.setEnvironment(environment);//设置环境
        //调用Spring内部的类扫描方法扫描出所有Class
        Set<BeanDefinition> classSet = findCandidateComponents("com.lyq3");
        //遍历寻找使用了@Http注解的Class
        Set<Class<?>> httpClassSet = new LinkedHashSet();
        if(classSet == null || classSet.size()<=0){
            return;
        }
        classSet.forEach((cls) -> {
            System.out.println("==class:"+cls.getBeanClassName()+"===");
            if(cls.getClass().isAnnotationPresent(Http.class)){
//                httpClassSet.add(cls.getClass());
                System.out.println("==符合:"+cls.getBeanClassName()+"===");
                createProxyClass(cls.getClass());
            }
        });
//        Set<Class<?>> requests = new Reflections("com.lyq3").getTypesAnnotatedWith(Http.class);
//        for (Class<?> cls : requests) {
//            createProxyClass(cls);
//
//        }

    }


    private void createProxyClass(Class<?> cls) {
        System.err.println("\tcreate proxy for class:" + cls);
        // rest服务器相关信息
//        final RestInfo restInfo = extractRestInfo(cls);
//        InvocationHandler handler = new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                RequestInfo request = extractRequestInfo(method, args);
//                return requestHandle.handle(restInfo, request);
//            }
//
//        };
//        // 创建动态代理类
//        Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{cls}, handler);
//        registerBean(cls.getName(), proxy);
    }
}
