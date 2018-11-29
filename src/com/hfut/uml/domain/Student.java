package com.hfut.uml.domain;

public class Student {
	String sno;
	String password;
	public Student() {
		super();
	}
	public Student(String sno, String password) {
		super();
		this.sno = sno;
		this.password = password;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
