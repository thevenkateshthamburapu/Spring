package com.springcore.baw.constructor.bean;

public class Robot {
	
	private String robotId;
	private String robotType;
	private Chip chip;

	public Robot(String robotId, String robotType, Chip chip) {
		this.robotId = robotId;
		this.robotType = robotType;
		this.chip = chip;
	}
	
	@Override
	public String toString() {
		return "Robot [robotId=" + robotId + ", robotType=" + robotType + ", chip=" + chip + "]";
	}

}
