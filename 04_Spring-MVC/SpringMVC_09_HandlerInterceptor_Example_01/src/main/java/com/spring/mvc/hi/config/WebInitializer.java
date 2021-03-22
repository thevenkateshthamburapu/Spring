package com.spring.mvc.hi.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// add WebConfig class(dispatcher-servlet.xml)
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// url mapping
		return new String[] { "/" };
	}

}
