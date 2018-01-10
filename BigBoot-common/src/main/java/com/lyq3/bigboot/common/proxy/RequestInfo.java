package com.lyq3.bigboot.common.proxy;

import java.util.LinkedHashMap;

/**
 * 请求信息(请求参数等)包装类
 * @author 卡卢比
 */
public class RequestInfo {
    private String url;
    private Class<?> returnType;
    private LinkedHashMap<String,String> params;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Class<?> getReturnType() {
        return returnType;
    }

    public void setReturnType(Class<?> returnType) {
        this.returnType = returnType;
    }

    public LinkedHashMap<String, String> getParams() {
        return params;
    }

    public void setParams(LinkedHashMap<String, String> params) {
        this.params = params;
    }
}
