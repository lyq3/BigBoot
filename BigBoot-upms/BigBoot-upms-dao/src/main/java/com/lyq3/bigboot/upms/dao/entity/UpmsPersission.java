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
public class UpmsPersission extends Model<UpmsPersission> {

    private static final long serialVersionUID = 1L;

	private Integer permissionId;
    /**
     * 所属系统
     */
	private Integer sysId;
    /**
     * 上级权限ID
     */
	private Integer pid;
    /**
     * 权限名
     */
	private String name;
    /**
     * 权限类型（1：目录，2：菜单，3：按钮）
     */
	private Integer type;
    /**
     * 权限URL
     */
	private String url;
    /**
     * 权限值
     */
	private String value;
    /**
     * 图标
     */
	private String icon;
    /**
     * 状态
     */
	private Integer status;
	private Date createtime;


	public Integer getPermissionId() {
		return permissionId;
	}

	public UpmsPersission setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
		return this;
	}

	public Integer getSysId() {
		return sysId;
	}

	public UpmsPersission setSysId(Integer sysId) {
		this.sysId = sysId;
		return this;
	}

	public Integer getPid() {
		return pid;
	}

	public UpmsPersission setPid(Integer pid) {
		this.pid = pid;
		return this;
	}

	public String getName() {
		return name;
	}

	public UpmsPersission setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getType() {
		return type;
	}

	public UpmsPersission setType(Integer type) {
		this.type = type;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public UpmsPersission setUrl(String url) {
		this.url = url;
		return this;
	}

	public String getValue() {
		return value;
	}

	public UpmsPersission setValue(String value) {
		this.value = value;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public UpmsPersission setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public UpmsPersission setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public UpmsPersission setCreatetime(Date createtime) {
		this.createtime = createtime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.permissionId;
	}

}
