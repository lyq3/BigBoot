package com.lyq3.bigboot.common.annotation;

import java.lang.annotation.*;

/**
 * HTTP调用注解
 * @author 卡卢比
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Http {
    /**请求URL*/
    String value() default "";
}
