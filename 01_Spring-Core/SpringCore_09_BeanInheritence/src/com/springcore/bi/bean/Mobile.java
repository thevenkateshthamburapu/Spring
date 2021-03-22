package com.springcore.bi.bean;

public class Mobile {

	private Integer mobileId;
	private String name;
	private String color;
	private Double price;
	private String imeiNo;
	
	
	public Integer getMobileId() {
		return mobileId;
	}
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImeiNo() {
		return imeiNo;
	}
	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", name=" + name + ", color=" + color + ", price=" + price + ", imeiNo="
				+ imeiNo + "]";
	}
	
	
}
