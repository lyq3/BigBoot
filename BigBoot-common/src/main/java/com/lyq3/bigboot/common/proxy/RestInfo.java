package com.lyq3.bigboot.common.proxy;

/**
 * 包装服务器信息类，目前只有host，其他自己配置即可。
 * @author 卡卢比
 */
public class RestInfo {
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}