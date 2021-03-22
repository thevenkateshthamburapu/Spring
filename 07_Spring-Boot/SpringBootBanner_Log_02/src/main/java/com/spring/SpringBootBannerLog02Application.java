package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerLog02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBannerLog02Application.class, args);
		System.out.println("************Logging Complete************");
	}

}
