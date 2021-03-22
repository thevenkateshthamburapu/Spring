package com.springcore.anno.dso.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import com.springcore.anno.dso.bean.A;
import com.springcore.anno.dso.bean.B;

@Configuration
public class AppConfig {
	
	@Bean("a")
	@DependsOn("b")
	public A createA() {
		return new A();
	}
	@Bean("b")
	@Lazy
	public B createB() {
		return new B();
	}
}
	/*
	@Configuration- it indicate that this is 
	configuration class just xml configuration file

	@Bean-it indicate that the car is bean just like 
	xml bean
	
	@DependsOn-one bean is dependent on bean we use it
	
	@Lazy-if you don't want to create object for singleton 
	at the time of IoC Starting then we can specify
*/