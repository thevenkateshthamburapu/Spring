package com.springcore.bs.prototype.bean;

public class Car {
	
	private String carname;
	private Integer price;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", price=" + price + "]";
	}
	
	

}
