package com.spring.boot.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entities.StudentEntity;

public interface StudentDao extends JpaRepository<StudentEntity, Serializable> {

}
