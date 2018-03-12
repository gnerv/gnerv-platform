package com.gnerv.platform.user.model;

public class User {
	private String logincode;
	private String username;
	private String password;

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

	@Override
	public String toString() {
		return "User [logincode=" + logincode + ", username=" + username + ", password=" + password + "]";
	}

}
