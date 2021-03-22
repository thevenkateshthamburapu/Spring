package com.springcore.fm.sfm.bean;

import java.util.Calendar;

public class Alarm {
	
	private Calendar cal;

	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	
	public void ring(){
		System.out.println("Time : "+cal.getTime());
		System.out.println("Ringing.....!");
	}

}
