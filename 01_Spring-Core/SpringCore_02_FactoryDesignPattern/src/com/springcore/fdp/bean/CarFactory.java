package com.springcore.fdp.bean;

public class CarFactory {
	
	public static ICar createCar(String type) {
		ICar car = null;
		if (type.equals("normal")) {
			car = new NormalCar();
		} else if (type.equals("luxury")) {
			car = new LuxuryCar();
		}
		return car;
	}

}

//In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.