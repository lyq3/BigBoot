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
public class UpmsOrganization extends Model<UpmsOrganization> {

    private static final long serialVersionUID = 1L;

    /**
     * 组织机构ID
     */
	private Integer organizationId;
	private Integer pid;
	private String name;
	private String description;
	private Integer status;
	private Date createtime;


	public Integer getOrganizationId() {
		return organizationId;
	}

	public UpmsOrganization setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
		return this;
	}

	public Integer getPid() {
		return pid;
	}

	public UpmsOrganization setPid(Integer pid) {
		this.pid = pid;
		return this;
	}

	public String getName() {
		return name;
	}

	public UpmsOrganization setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public UpmsOrganization setDescription(String description) {
		this.description = description;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public UpmsOrganization setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public UpmsOrganization setCreatetime(Date createtime) {
		this.createtime = createtime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.organizationId;
	}

}
