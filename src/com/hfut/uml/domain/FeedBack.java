package com.hfut.uml.domain;

import java.sql.Date;
import java.util.Calendar;

public class FeedBack {
	private int fid;
	private String fcontent;
	private String sno;
	private String tno;
	private Date ftime;
	private int isanyonymity;
	private int checkbyadmin;
	private int checkbycounsellor;
	private String fbackcontent;
	public FeedBack(){
		super();
	};
	public FeedBack( String fcontent, String sno, String tno, int isAnyonymity, 
			 String fBackContent) {
		super();
		this.fcontent = fcontent;
		this.sno = sno;
		this.tno = tno;
		ftime = new Date(System.currentTimeMillis());
		this.isanyonymity = isAnyonymity;
		this.checkbyadmin = 0;
		this.checkbycounsellor = 0;
		this.fbackcontent = fBackContent;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFcontent() {
		return fcontent;
	}
	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
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
	public Date getFtime() {
		return ftime;
	}
	public void setFtime(Date ftime) {
		this.ftime = ftime;
	}
	public int getIsanyonymity() {
		return isanyonymity;
	}
	public void setIsanyonymity(int isanyonymity) {
		this.isanyonymity = isanyonymity;
	}
	public int getCheckbyadmin() {
		return checkbyadmin;
	}
	public void setCheckbyadmin(int checkbyadmin) {
		this.checkbyadmin = checkbyadmin;
	}
	public int getCheckbycounsellor() {
		return checkbycounsellor;
	}
	public void setCheckbycounsellor(int checkbycounsellor) {
		this.checkbycounsellor = checkbycounsellor;
	}
	public String getFbackcontent() {
		return fbackcontent;
	}
	public void setFbackcontent(String fbackcontent) {
		this.fbackcontent = fbackcontent;
	}
	
}
