package com.springcore.ni.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.ni.bean.Movie;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/ni/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Movie movie=factory.getBean("movie",Movie.class);
		System.out.println(movie);
	}

}
