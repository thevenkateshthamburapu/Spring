package com.springaop.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.springaop.pc.aspect.WeatherStationAdvisor;
import com.springaop.pc.aspect.WeatherStationDynamicPointcut;
import com.springaop.pc.aspect.WeatherStationStaticPointcut;
import com.springaop.pc.bean.WeatherStation;

public class Test {

	public static void main(String[] args) {
		
		ProxyFactory factory = new ProxyFactory();
		//set Target bean
		factory.setTarget(new WeatherStation());

		WeatherStationAdvisor wsad = new WeatherStationAdvisor();
		
		WeatherStationStaticPointcut wssp = new WeatherStationStaticPointcut();
		
		WeatherStationDynamicPointcut wsdp = new WeatherStationDynamicPointcut();
		//set Advice bean
		factory.addAdvisor(new DefaultPointcutAdvisor(wsdp, wsad));

		WeatherStation wstation = (WeatherStation) factory.getProxy();

		System.out.println("Temperature : " + wstation.getTemperature(6000));
		System.out.println("Will Rain ? : " + wstation.willRainInAnHour(5001));

	}

}
