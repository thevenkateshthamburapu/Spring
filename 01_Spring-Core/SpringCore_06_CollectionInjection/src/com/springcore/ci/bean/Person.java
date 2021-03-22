package com.springcore.ci.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private Integer personId;
	private String personName;
	private List<String> visitedPlaces;
	private Set<String> courses;
	private Map<String,String> parents;
	private Properties emails;
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setVisitedPlaces(List<String> visitedPlaces) {
		this.visitedPlaces = visitedPlaces;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public void setParents(Map<String, String> parents) {
		this.parents = parents;
	}
	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", visitedPlaces=" + visitedPlaces
				+ ", courses=" + courses + ", parents=" + parents + ", emails=" + emails + "]";
	}
	
	
	
	
}
