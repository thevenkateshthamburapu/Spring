package com.spring.rest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//rootcontext.xml
		return new Class[]{AppConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//dispatcher-servelt.xml
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		//url-pattern
		return new String[]{"/rest/*"};
	}
	
	

}
