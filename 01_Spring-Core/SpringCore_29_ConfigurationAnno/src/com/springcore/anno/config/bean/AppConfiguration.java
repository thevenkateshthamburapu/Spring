package com.springcore.anno.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {
	
	@Bean
	@Scope(value="prototype")
	public Car getCar(){
		return new Car();
	}

}
	/*
	@Configuration- it indicate that this is 
	configuration class just xml configuration file
	
	@Bean-it indicate that the car is bean just like
	xml bean
	
	@Scope-it indicate that the bean is singleton /
	prototype etc... just like in xml file
	*/