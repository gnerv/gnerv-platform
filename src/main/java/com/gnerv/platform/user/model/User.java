package com.gnerv.platform.user.model;

import java.util.Date;

public class User {
	private String logincode;
	private String username;
	private String password;
	private char state;
	private Date createTime;
	private Date modefyTime;
	
	public String getLogincode() {
		return logincode;
	}
	public void setLogincode(String logincode) {
		this.logincode = logincode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getState() {
		return state;
	}
	public void setState(char state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModefyTime() {
		return modefyTime;
	}
	public void setModefyTime(Date modefyTime) {
		this.modefyTime = modefyTime;
	}
	@Override
	public String toString() {
		return "User [logincode=" + logincode + ", username=" + username + ", password=" + password + ", state=" + state
				+ ", createTime=" + createTime + ", modefyTime=" + modefyTime + "]";
	}

}
