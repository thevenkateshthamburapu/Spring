package com.spring.boot.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.boot.entities.Product;

public interface ProductDao  extends JpaRepository<Product, Serializable> {

	


	@Query("select pname from Product")
	public List<String> findProductNames();
}
