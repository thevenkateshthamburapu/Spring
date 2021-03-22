package com.springaop.ta.bean;

public class DepartmentDao {
	
	public void insert() {
		System.out.println("insert () : started");
		throw new NullPointerException();
	}
}
