package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.boot.service.WelcomeService;

@SpringBootApplication
public class SpringBootWelcomeExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=SpringApplication.run(SpringBootWelcomeExampleApplication.class, args);
		WelcomeService ws = ctx.getBean(WelcomeService.class);
		System.out.println(ws.wishMsg());
	
	}

}
