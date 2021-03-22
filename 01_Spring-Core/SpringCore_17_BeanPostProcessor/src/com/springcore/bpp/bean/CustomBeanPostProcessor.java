package com.springcore.bpp.bean;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before initialization :" + obj);
		if (obj instanceof PrintMessage) {
			PrintMessage pm = (PrintMessage) obj;
			pm.setCreatedDt(new Date());
		}
		return obj;
	}

	
	@Override
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("AFter initializaton :" + obj);
		if (obj instanceof PrintMessage) {
			PrintMessage pm = (PrintMessage) obj;
			pm.setModifiedDt(new Date());
		}
		return obj;
	}


}
