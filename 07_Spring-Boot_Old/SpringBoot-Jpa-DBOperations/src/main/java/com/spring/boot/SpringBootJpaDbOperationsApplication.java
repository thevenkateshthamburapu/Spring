package com.spring.boot;

import java.io.Serializable;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.boot.entities.Product;
import com.spring.boot.service.ProductService;

@SpringBootApplication
public class SpringBootJpaDbOperationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJpaDbOperationsApplication.class, args);
		ProductService service = ctx.getBean(ProductService.class);
//1
		/*Product p = new Product();
		p.setPname("Keyboard");
		p.setPrice(4250.00);

		Serializable ser = service.insert(p);

		if (ser != null) {
			System.out.println("Record inserted");
		} else {
			System.out.println("Failed to insert..");
		}*/
		
//2		
		/*Product pd = service.findProductById(4);
		System.out.println(pd);*/
	
//3		
		/*List<Product> products = service.findAllProducts();

		if(!products.isEmpty()){
			for(Product p: products){
				System.out.println(p);
			}
		}*/
//4	
		/*List<String> names = service.findAllProductNames();
		if(!names.isEmpty()){
			for(String name : names){
				System.out.println(name);
			}
		}*/

	}
}
