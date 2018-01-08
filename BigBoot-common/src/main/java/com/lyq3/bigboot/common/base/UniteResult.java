package com.lyq3.bigboot.common.base;

import java.io.Serializable;

/**
 * 统一响应结果
 * @author 卡卢比
 */
public class UniteResult<T>{
    private static final int SUCCESS = 1;
    private static final int ERROR = -1;
    private static final int NO_PERMISSIONS = 0;
    /**响应代码*/
    private int code = SUCCESS;
    /**响应信息*/
    private String msg = "成功";
    /**返回数据*/
    private T data;

    public static int getSUCCESS() {
        return SUCCESS;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getNoPermissions() {
        return NO_PERMISSIONS;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
