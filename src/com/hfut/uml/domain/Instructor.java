package com.hfut.uml.domain;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
	private String counno;
	private String password;
	public Instructor(){}
	public Instructor(String counno,String password){
		this.counno = counno;
		this.password = password;
	}
	public String getCounno() {
		return counno;
	}
	public void setCounno(String counno) {
		this.counno = counno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
