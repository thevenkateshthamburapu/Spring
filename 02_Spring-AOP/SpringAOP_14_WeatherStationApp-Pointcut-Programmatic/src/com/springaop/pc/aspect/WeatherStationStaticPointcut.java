package com.springaop.pc.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.springaop.pc.bean.WeatherStation;

public class WeatherStationStaticPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> cls) {
		if (m.getName().equals("getTemperature") && cls == WeatherStation.class) {
			return true;
		}
		return false;
	}

}
