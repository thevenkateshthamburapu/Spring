package com.spring.orm.hibernate.service;

import com.spring.orm.hibernate.entity.Emp;

public interface EmpService {
	public boolean save(Emp entity);

	public Emp findByid(int eid);

	public java.util.List<Emp> findAll();
}
