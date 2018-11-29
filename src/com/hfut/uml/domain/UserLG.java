package com.hfut.uml.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class UserLG {
	@NotEmpty(message="用户名不能为空！")
	String username;
	@NotEmpty(message="密码不能为空！")
	String password;
	public UserLG(){
		super();
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
}