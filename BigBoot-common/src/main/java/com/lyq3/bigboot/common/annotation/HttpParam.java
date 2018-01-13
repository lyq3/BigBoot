package com.lyq3.bigboot.common.annotation;

/**
 * 请求参数注解
 * @author 卡卢比
 */
public @interface HttpParam {
    /**参数名*/
    String value() default "";
}
