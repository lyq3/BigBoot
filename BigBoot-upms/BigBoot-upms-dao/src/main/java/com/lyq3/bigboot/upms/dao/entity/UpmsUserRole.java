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
public class UpmsUserRole extends Model<UpmsUserRole> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer userId;
	private Integer roleId;


	public Integer getId() {
		return id;
	}

	public UpmsUserRole setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getUserId() {
		return userId;
	}

	public UpmsUserRole setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public UpmsUserRole setRoleId(Integer roleId) {
		this.roleId = roleId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
