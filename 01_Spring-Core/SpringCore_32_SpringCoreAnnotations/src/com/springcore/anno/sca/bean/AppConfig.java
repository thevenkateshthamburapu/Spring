package com.springcore.anno.sca.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Employee getEmp() {
		return new Employee();
	}

}

	/*
	@Configuration- it indicate that this is 
	configuration class just xml configuration file

	@Bean-it indicate that the car is bean 
	just like xml bean
*/