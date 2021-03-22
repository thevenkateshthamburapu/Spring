package com.springcore.anno.comp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("s")
public class Student {
	
	private Integer sid;
	private String name;
	private String email;
	
	public Integer getSid() {
		return sid;
	}
	@Value(value="054")
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	@Value(value="Venkatesh")
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@Value(value="venky4789@yahoo.com")
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + "]";
	}
	

}

	/*
	@Component- use a classpath scanning to register 
	components
	
	@Value-used to inject value into variables
	*/

