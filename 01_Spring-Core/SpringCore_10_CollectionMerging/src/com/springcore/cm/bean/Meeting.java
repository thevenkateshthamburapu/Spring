package com.springcore.cm.bean;

import java.util.Set;

public class Meeting {
	
	private String meetingType;
	private Set<String> participants;
	
	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}
	public void setParticipants(Set<String> participants) {
		this.participants = participants;
	}
	@Override
	public String toString() {
		return "Meeting [meetingType=" + meetingType + ", participants=" + participants + "]";
	}
	

	

}
