package com.spring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootBannerOff01Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootBannerOff01Application.class, args);
		new SpringApplicationBuilder(SpringBootBannerOff01Application.class)
		.bannerMode(Banner.Mode.OFF)
		.run(args);
	}

}
//spring banner is not printing on console.