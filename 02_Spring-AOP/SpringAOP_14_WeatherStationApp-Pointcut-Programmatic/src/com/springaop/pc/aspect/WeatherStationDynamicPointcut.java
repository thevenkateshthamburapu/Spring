package com.springaop.pc.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.springaop.pc.bean.WeatherStation;

public class WeatherStationDynamicPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> cls, Object... args) {

		if (m.getName().equals("getTemperature") && cls == WeatherStation.class && (int) args[0] >= 5000) {
			return true;
		}
		return false;
	}

}
