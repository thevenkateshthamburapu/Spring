package com.springcore.anno.ra.bean;

import javax.annotation.Resource;

public class Employee {
	
	@Resource(name="company")
	private Company company;
	@Resource(name="address")
	private Address address;
	public Company getCompany() {
		return company;
	}
	public Address getAddress() {
		return address;
	}

}

	/*
	@Resource-it is applied on fields or methods, 
	the container injects the requested resource
	*/