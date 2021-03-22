package com.springcore.blc.ann.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Motor {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void start(){
		// TODO Auto-generated method stub
		System.out.println("Motor Starting...");
	}

	public void running(){
		System.out.println(name+" Motor Running...");
	}

	@PreDestroy
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Motor Stopping...");
		
	}

}
