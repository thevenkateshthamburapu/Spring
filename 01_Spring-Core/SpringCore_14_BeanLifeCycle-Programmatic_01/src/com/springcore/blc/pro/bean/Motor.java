package com.springcore.blc.pro.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean,DisposableBean {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Motor Starting...");
	}

	public void running(){
		System.out.println(name+" Motor Running...");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Motor Stopping...");
		
	}

}
