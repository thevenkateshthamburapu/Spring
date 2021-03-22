package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootBannerLog01Application {

	private static Logger log=LoggerFactory.getLogger(SpringBootBannerLog01Application.class);
	
	public static void main(String[] args) {
		//log.info(":::::Main Method Invoked:::::::");
		//SpringApplication.run(SpringBootBannerLog01Application.class, args);
		
		//log.info(":::::Main Method Banner=>Mode=>LOG:::::::");
		  new SpringApplicationBuilder(SpringBootBannerLog01Application.class)
		  .bannerMode(Banner.Mode.LOG) .run(args);
		 
		//log.info(":::::Main Method Complete:::::::");
		System.out.println("************Logging Complete************");
	}

}

//spring banner is printing on log file.