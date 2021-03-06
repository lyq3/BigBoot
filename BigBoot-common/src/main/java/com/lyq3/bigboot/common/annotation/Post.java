package com.lyq3.bigboot.common.annotation;

import java.lang.annotation.*;

/**
 * 发送 POST 请求 注解
 * @author 卡卢比
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Post {
    /**请求URL*/
    String value() default "";
}
