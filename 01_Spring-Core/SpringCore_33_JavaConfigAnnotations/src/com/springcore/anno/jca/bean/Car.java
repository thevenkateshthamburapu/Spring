package com.springcore.anno.jca.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private int id;
	private String name;
	private Engine eng;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Inject
	@Named("eng1")
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Car started...");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Car stopped...");
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", eng=" + eng + "]";
	}
}
	
	/*
	@Inject-it just like @Autowired
	
	@Named-it just like @Qualifier

	@Autowired-it indicate that it automatically add 
	dependencies when needed

	@Qualifier-it indicate that we have so many beans 
	in xml file we need to mention that which one execute
	
	@PostConstruct & @PreDestroy-In Spring, you can 
	 either implements InitializingBean and DisposableBean
	 interface or specify the init-method and 
	 destroy-method in bean configuration file for the
	 initialization and destruction callback function.
*/