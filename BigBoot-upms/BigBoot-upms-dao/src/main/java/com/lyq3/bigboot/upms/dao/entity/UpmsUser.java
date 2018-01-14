package com.lyq3.bigboot.upms.dao.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 卡卢比
 * @since 2018-01-06
 */
@ApiModel("用户实体")
public class UpmsUser {

    private static final long serialVersionUID = 1L;

	private Integer userId;
	private String username;
    /**
     * 密码（加密后）
     */
	private String password;
    /**
     * 加密盐
     */
	private String salt;
    /**
     * 真实姓名
     */
	private String realname;
    /**
     * 昵称
     */
	private String nickname;
    /**
     * 头像
     */
	private String avatar;
    /**
     * 电话
     */
	private String phone;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 性别
     */
	private Integer sex;
    /**
     * 状态（1-正常，2-停用）
     */
	private Integer status;
    /**
     * 创建时间
     */
	private Date createtime;


	public Integer getUserId() {
		return userId;
	}

	public UpmsUser setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public UpmsUser setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public UpmsUser setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getSalt() {
		return salt;
	}

	public UpmsUser setSalt(String salt) {
		this.salt = salt;
		return this;
	}

	public String getRealname() {
		return realname;
	}

	public UpmsUser setRealname(String realname) {
		this.realname = realname;
		return this;
	}

	public String getNickname() {
		return nickname;
	}

	public UpmsUser setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public String getAvatar() {
		return avatar;
	}

	public UpmsUser setAvatar(String avatar) {
		this.avatar = avatar;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public UpmsUser setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public UpmsUser setEmail(String email) {
		this.email = email;
		return this;
	}

	public Integer getSex() {
		return sex;
	}

	public UpmsUser setSex(Integer sex) {
		this.sex = sex;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public UpmsUser setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public UpmsUser setCreatetime(Date createtime) {
		this.createtime = createtime;
		return this;
	}

	@Override
	public String toString() {
		return "UpmsUser{" +
				"userId=" + userId +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", salt='" + salt + '\'' +
				", realname='" + realname + '\'' +
				", nickname='" + nickname + '\'' +
				", avatar='" + avatar + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", sex=" + sex +
				", status=" + status +
				", createtime=" + createtime +
				'}';
	}

}
