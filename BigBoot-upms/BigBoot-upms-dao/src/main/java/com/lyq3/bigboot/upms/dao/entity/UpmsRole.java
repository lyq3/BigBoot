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
public class UpmsRole extends Model<UpmsRole> {

    private static final long serialVersionUID = 1L;

	private Integer roleId;
	private String roleName;
    /**
     * 角色描述
     */
	private String description;
    /**
     * 创建时间
     */
	private Date createtime;
    /**
     * 角色状态
     */
	private String status;


	public Integer getRoleId() {
		return roleId;
	}

	public UpmsRole setRoleId(Integer roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getRoleName() {
		return roleName;
	}

	public UpmsRole setRoleName(String roleName) {
		this.roleName = roleName;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public UpmsRole setDescription(String description) {
		this.description = description;
		return this;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public UpmsRole setCreatetime(Date createtime) {
		this.createtime = createtime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public UpmsRole setStatus(String status) {
		this.status = status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.roleId;
	}

}
