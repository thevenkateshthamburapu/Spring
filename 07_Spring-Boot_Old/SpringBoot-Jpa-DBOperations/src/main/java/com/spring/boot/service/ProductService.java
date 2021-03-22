package com.spring.boot.service;

import java.io.Serializable;
import java.util.List;

import com.spring.boot.entities.Product;

public interface ProductService {

	Serializable insert(Product p);

	Product findProductById(Integer pid);

	List<Product> findAllProducts();

	List<String> findAllProductNames();

}
