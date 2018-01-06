package com.lyq3.bigboot.upms.dao.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 卡卢比
 * @since 2018-01-06
 */
public class UpmsLog extends Model<UpmsLog> {

    private static final long serialVersionUID = 1L;

	private Integer logId;
    /**
     * 描述
     */
	private String description;
    /**
     * 开始时间
     */
	private Date startTime;
    /**
     * 耗时
     */
	private Integer spendTime;
    /**
     * 根路径
     */
	private String basePath;
	private String url;
    /**
     * 请求方法
     */
	private String method;
    /**
     * 请求参数
     */
	private String parameter;
    /**
     * 用户表示
     */
	private String userAgent;
	private String ip;
    /**
     * 响应结果
     */
	private String result;
    /**
     * 权限值
     */
	private String permissions;


	public Integer getLogId() {
		return logId;
	}

	public UpmsLog setLogId(Integer logId) {
		this.logId = logId;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public UpmsLog setDescription(String description) {
		this.description = description;
		return this;
	}

	public Date getStartTime() {
		return startTime;
	}

	public UpmsLog setStartTime(Date startTime) {
		this.startTime = startTime;
		return this;
	}

	public Integer getSpendTime() {
		return spendTime;
	}

	public UpmsLog setSpendTime(Integer spendTime) {
		this.spendTime = spendTime;
		return this;
	}

	public String getBasePath() {
		return basePath;
	}

	public UpmsLog setBasePath(String basePath) {
		this.basePath = basePath;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public UpmsLog setUrl(String url) {
		this.url = url;
		return this;
	}

	public String getMethod() {
		return method;
	}

	public UpmsLog setMethod(String method) {
		this.method = method;
		return this;
	}

	public String getParameter() {
		return parameter;
	}

	public UpmsLog setParameter(String parameter) {
		this.parameter = parameter;
		return this;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public UpmsLog setUserAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public UpmsLog setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getResult() {
		return result;
	}

	public UpmsLog setResult(String result) {
		this.result = result;
		return this;
	}

	public String getPermissions() {
		return permissions;
	}

	public UpmsLog setPermissions(String permissions) {
		this.permissions = permissions;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.logId;
	}

}
