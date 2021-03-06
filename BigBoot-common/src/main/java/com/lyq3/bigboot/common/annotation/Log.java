package com.lyq3.bigboot.common.annotation;

import java.lang.annotation.*;

/**
 * 日志注解
 * @author 卡卢比
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String value() default "";
}
