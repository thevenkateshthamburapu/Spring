package com.spring.boot.service;

import java.util.List;

import com.spring.boot.model.Student;

public interface StudentService {

	public boolean insert(Student student);

	public List<Student> findAllStudents();

	public boolean delete(Integer stuid);

	public Student edit(Integer stuid);

	public boolean update(Student s);

}
