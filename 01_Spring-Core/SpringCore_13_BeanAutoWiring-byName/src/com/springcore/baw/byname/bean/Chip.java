package com.springcore.baw.byname.bean;

public class Chip {

	private String chipId;
	private String chipType;
	
	public String getChipId() {
		return chipId;
	}
	public void setChipId(String chipId) {
		this.chipId = chipId;
	}
	public String getChipType() {
		return chipType;
	}
	public void setChipType(String chipType) {
		this.chipType = chipType;
	}
	
	@Override
	public String toString() {
		return "Chip [chipId=" + chipId + ", chipType=" + chipType + "]";
	}

}
