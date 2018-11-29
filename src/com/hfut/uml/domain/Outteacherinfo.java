package com.hfut.uml.domain;

public class Outteacherinfo {
	private String outtno;
	private String password;
	private String name;
	private String workteam;
	private String type;
	private String job;
	private String degree;
	private String workyear;
	private String graduatesch;
	private String teacourse;
	private String espertise;
	private String projectitem;
	private String qualification;
	private int  review;
	public Outteacherinfo(String outtno, String password, String name, String workteam, String type, String job,
			String degree, String workyear, String graduatesch, String teacourse, String espertise, String projectitem,
			String qualification, int review) {
		super();
		this.outtno = outtno;
		this.password = password;
		this.name = name;
		this.workteam = workteam;
		this.type = type;
		this.job = job;
		this.degree = degree;
		this.workyear = workyear;
		this.graduatesch = graduatesch;
		this.teacourse = teacourse;
		this.espertise = espertise;
		this.projectitem = projectitem;
		this.qualification = qualification;
		this.review = review;
	}
	public Outteacherinfo() {
		super();
	}
	public String getOuttno() {
		return outtno;
	}
	public void setOuttno(String outtno) {
		this.outtno = outtno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkteam() {
		return workteam;
	}
	public void setWorkteam(String workteam) {
		this.workteam = workteam;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getWorkyear() {
		return workyear;
	}
	public void setWorkyear(String workyear) {
		this.workyear = workyear;
	}
	public String getGraduatesch() {
		return graduatesch;
	}
	public void setGraduatesch(String graduatesch) {
		this.graduatesch = graduatesch;
	}
	public String getTeacourse() {
		return teacourse;
	}
	public void setTeacourse(String teacourse) {
		this.teacourse = teacourse;
	}
	public String getEspertise() {
		return espertise;
	}
	public void setEspertise(String espertise) {
		this.espertise = espertise;
	}
	public String getProjectitem() {
		return projectitem;
	}
	public void setProjectitem(String projectitem) {
		this.projectitem = projectitem;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	
}
