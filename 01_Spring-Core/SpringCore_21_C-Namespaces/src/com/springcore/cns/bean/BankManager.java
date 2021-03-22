package com.springcore.cns.bean;

public class BankManager {
	
	private String managerName;
	private String managerExp;
	private String email;
	
	public BankManager(String managerName, String managerExp, String email) {
		
		this.managerName = managerName;
		this.managerExp = managerExp;
		this.email = email;
	}

	@Override
	public String toString() {
		return "BankManager [managerName=" + managerName + ", managerExp=" + managerExp + ", email=" + email + "]";
	}

}
