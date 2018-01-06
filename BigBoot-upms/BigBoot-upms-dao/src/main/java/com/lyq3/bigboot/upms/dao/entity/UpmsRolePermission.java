package com.lyq3.bigboot.upms.dao.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
public class UpmsRolePermission extends Model<UpmsRolePermission> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer roleId;
	private Integer permissionId;


	public Integer getId() {
		return id;
	}

	public UpmsRolePermission setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public UpmsRolePermission setRoleId(Integer roleId) {
		this.roleId = roleId;
		return this;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public UpmsRolePermission setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
