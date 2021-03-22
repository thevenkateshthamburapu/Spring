package com.springcore.anno.sca.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int empId;
	@Autowired
	@Qualifier("present")
	private Address addr;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", addr=" + addr + "]";
	}

}
	/*
	@Autowired-it indicate that it automatically add 
	dependencies when needed

	@Qualifier-it indicate that we have so many beans 
	in xml file we need to mention that which one 
	execute
*/
