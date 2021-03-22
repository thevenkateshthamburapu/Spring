package com.springcore.bpp.bean;

import java.util.Date;

public class PrintMessage {
	
	private String msg;
	private Date createdDt;
	private Date modifiedDt;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public Date getModifiedDt() {
		return modifiedDt;
	}
	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}
	
	@Override
	public String toString() {
		return "PrintMessage [msg=" + msg + ", createdDt=" + createdDt + ", modifiedDt=" + modifiedDt + "]";
	}
	
	

}
