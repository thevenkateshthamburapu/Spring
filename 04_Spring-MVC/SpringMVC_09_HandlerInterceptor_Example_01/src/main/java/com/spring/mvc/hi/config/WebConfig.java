package com.spring.mvc.hi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.mvc.hi.interceptor.BrowserCheckInterceptor;
import com.spring.mvc.hi.interceptor.ExecutionTimeInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.spring.mvc.hi.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver createViewResolver() {
		InternalResourceViewResolver res = new InternalResourceViewResolver();
		res.setPrefix("/WEB-INF/views/");
		res.setSuffix(".jsp");
		return res;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new ExecutionTimeInterceptor());
		registry.addInterceptor(new BrowserCheckInterceptor());
		/*registry.addInterceptor(new ExecutionTimeInterceptor()).addPathPatterns("/welcome");
		registry.addInterceptor(new BrowserCheckInterceptor());*/
	}
	
}
