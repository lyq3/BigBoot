package com.lyq3.bigboot.common.proxy;

/**
 * 处理网络请求接口
 * @author 卡卢比
 */
public interface RequestHandle {
    Object handle(RestInfo restInfo, RequestInfo request);
}
