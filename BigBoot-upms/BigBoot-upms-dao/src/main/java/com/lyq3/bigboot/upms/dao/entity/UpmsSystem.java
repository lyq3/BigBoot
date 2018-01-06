package com.lyq3.bigboot.upms.dao.entity;

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
public class UpmsSystem extends Model<UpmsSystem> {

    private static final long serialVersionUID = 1L;

	private Integer sysId;
    /**
     * 图标
     */
	private String icon;
	private String name;
	private String description;
	private Integer status;


	public Integer getSysId() {
		return sysId;
	}

	public UpmsSystem setSysId(Integer sysId) {
		this.sysId = sysId;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public UpmsSystem setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public String getName() {
		return name;
	}

	public UpmsSystem setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public UpmsSystem setDescription(String description) {
		this.description = description;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public UpmsSystem setStatus(Integer status) {
		this.status = status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.sysId;
	}

}
