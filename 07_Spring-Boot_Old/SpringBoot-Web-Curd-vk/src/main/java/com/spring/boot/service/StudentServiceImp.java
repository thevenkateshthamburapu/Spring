package com.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.StudentDao;
import com.spring.boot.entities.StudentEntity;
import com.spring.boot.model.Student;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired(required=true)
	private StudentDao studentdao; 
	
	public boolean insert(Student student){
		StudentEntity entity=new StudentEntity();
		//entity.setStuid(student.getStuid());
		entity.setStuname(student.getStuname());
		entity.setMarks(student.getMarks());
		entity.setResult(student.getResult());
		entity.setActiveSw("Y");
		StudentEntity st=studentdao.save(entity);
		return (st.getStuid()!=null) ? true:false ;
	}
	public List<Student> findAllStudents(){
		List<StudentEntity> entities=studentdao.findAll();
		List<Student> students=new ArrayList<Student>();
		if(!entities.isEmpty()){
			for(StudentEntity entity:entities){
				if("Y".equals(entity.getActiveSw())){
					Student s=new Student();
					s.setStuid(entity.getStuid());
					s.setStuname(entity.getStuname());
					s.setMarks(entity.getMarks());
					s.setResult(entity.getResult());
					students.add(s);
					
				}
				
			}
		}
		return students;
	}
	public boolean delete(Integer stuid){
		StudentEntity entity=studentdao.findOne(stuid);
		entity.setActiveSw("N");
		StudentEntity s=studentdao.save(entity);
		return (s !=null) ? true : false;
		
	}
	public Student edit(Integer stuid) {
		StudentEntity entity = studentdao.findOne(stuid);

		// Converting entity to model obj
		Student s = new Student();
		s.setStuid(entity.getStuid());
		s.setStuname(entity.getStuname());
		s.setMarks(entity.getMarks());
		s.setResult(entity.getResult());

		return s;
	}
public boolean update(Student s) {
		
		StudentEntity entity = studentdao.findOne(s.getStuid());
		
		entity.setStuname(s.getStuname());
		entity.setMarks(s.getMarks());
		entity.setResult(s.getResult());

		StudentEntity st = studentdao.save(entity);

		return (st != null) ? true : false;
	}

	

}
