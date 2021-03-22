package com.springcore.baw.constructor.bean;

public class Chip {

	private String chipId;
	private String chipType;
	
	public Chip(String chipId, String chipType) {
		this.chipId = chipId;
		this.chipType = chipType;
	}
	
	@Override
	public String toString() {
		return "Chip [chipId=" + chipId + ", chipType=" + chipType + "]";
	}

}
