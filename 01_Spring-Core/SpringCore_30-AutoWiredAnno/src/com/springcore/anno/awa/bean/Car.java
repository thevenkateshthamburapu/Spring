package com.springcore.anno.awa.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Car {
	
	private Integer id;
	private String name;
	@Autowired(required=false)
	@Qualifier("p")
	private Engine eng;

	public Integer getId() {
		return id;
	}
	@Required
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", eng=" + eng + "]";
	}

}

	/*we can use p or d qualifier to know to which bean 
	execute we have so many beans in xml file we need
	to mention that*/

	/*
	@Autowired-it indicate that it automatically add 
	dependencies when needed
	
	@Qualifier-it indicate that we have so many beans
	in xml file we need to mention that which one execute
	
	@Required-it indicate that it is mandatory
	*/