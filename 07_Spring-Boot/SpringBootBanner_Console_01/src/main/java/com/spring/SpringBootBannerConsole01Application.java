package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerConsole01Application {

	public static void main(String[] args) {
		//by default spring banner mode is Console
		 SpringApplication.run(SpringBootBannerConsole01Application.class, args); 
		
		//by default spring banner mode is Console
		/*
		 * new SpringApplicationBuilder(SpringBootBannerConsole01Application.class)
		 * .bannerMode(Banner.Mode.CONSOLE) .run(args);
		 */
	}

}
