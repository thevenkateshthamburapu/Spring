package com.springcore.blc.dec.bean;

public class Motor {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void start(){
		System.out.println("Motor Starting...");
		
	}
	public void running(){
		System.out.println(name+" Motor Running...");
	}
	public void stop(){
		System.out.println("Motor Stopping...");
	}

}
