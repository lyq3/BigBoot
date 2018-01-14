package com.lyq3.bigboot.config;

import com.google.common.base.Predicate;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置类
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"com.cnct.web.controller"})
public class SwaggerConfig {
    @Bean
    public Docket Api() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("Pro")
//                .genericModelSubstitutes(DeferredResult.class)
//                .genericModelSubstitutes(ResponseEntity.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(true)
//                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .apis(getPredicate())
                .paths(PathSelectors.any())
//                .paths(or(regex("/api/.*")))//过滤的接口
                .build()
//                .securitySchemes(securitySchemes())
//                .securityContexts(securityContexts())
                .apiInfo(setInfo());
    }

    /**
     * 设置系统信息
     * @return
     */
    public ApiInfo setInfo(){
        return new ApiInfoBuilder()
                .title("<b>API接口文档</b>")//大标题
                .description("（1）方便前后端分离后，前端人员与后端人员的对接。<br/>（2）同时集成接口测试工具，方便后端测试接口<br/><span style='color:red'>（3）后端人员务必采用Swagger注解写好各接口的描述。</span>")//详细描述
                .version("1.0")//版本
                .termsOfServiceUrl("NO terms of service")
                .contact(new Contact("卡卢比", "http://blog.lyq3.com", "99190092@qq.com"))//作者
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.pc")
                .build();
    }

    /**
     * 获取API过滤器
     * @return
     */
    public Predicate<RequestHandler> getPredicate(){
        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>(){
            public boolean apply(RequestHandler input) {
                Class<?> declaringClass = input.declaringClass();
                if (declaringClass == BasicErrorController.class)// 排除
                    return false;
                if(declaringClass.isAnnotationPresent(RestController.class)) // 被注解的类
                    return true;
                if(input.isAnnotatedWith(ResponseBody.class)) // 被注解的方法
                    return true;
                return false;
            }
        };
        return predicate;
    }

    /**
     * 访问权限
     * @return
     */
//    private List<ApiKey> securitySchemes() {
//        return Lists.newArrayList(
//                new ApiKey("clientId", "客户端ID", "header"),
//                new ApiKey("clientSecret", "客户端秘钥", "header"),
//                new ApiKey("accessToken", "客户端访问标识", "header"));
//    }
//    private List<SecurityContext> securityContexts() {
//        return Lists.newArrayList(
//                SecurityContext.builder()
//                        .securityReferences(defaultAuth())
//                        .forPaths(PathSelectors.regex("/*.*"))
//                        .build()
//        );
//    }
//
//    List<SecurityReference> defaultAuth() {
//        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        return Lists.newArrayList(
//                new SecurityReference("clientId", authorizationScopes),
//                new SecurityReference("clientSecret", authorizationScopes),
//                new SecurityReference("accessToken", authorizationScopes));
//    }
}
