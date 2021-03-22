package com.spring.mvc.lf.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//replacement of web.xml
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//add WebConfig class(dispatcher-servlet.xml) 
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		//url mapping
		return new String[] { "/" };
	}
}
