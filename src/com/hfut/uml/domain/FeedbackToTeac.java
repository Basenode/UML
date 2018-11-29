package com.hfut.uml.domain;

public class FeedbackToTeac {
	private String sno;
	private String tno;
	private String cname;
	public FeedbackToTeac(String sno, String tno, String cname) {
		super();
		this.sno = sno;
		this.tno = tno;
		this.cname = cname;
	}
	public FeedbackToTeac() {
		super();
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
