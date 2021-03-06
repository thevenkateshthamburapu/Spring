package com.spring.orm.hibernate.dao;

import com.spring.orm.hibernate.entity.Emp;

public interface EmpDao {

	public boolean save(Emp entity);

	public Emp findByid(int eid);

	public java.util.List<Emp> findAll();

}
