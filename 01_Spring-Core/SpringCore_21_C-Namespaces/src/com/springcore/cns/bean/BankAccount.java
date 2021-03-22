package com.springcore.cns.bean;

public class BankAccount {
	
	private Long accNo;
	private String holderName;
	private String accType;
	private String ifscCode;
	private String branchLocation;
	private BankManager manager;
	
	public BankAccount(Long accNo, String holderName, String accType, String ifscCode, String branchLocation,
			BankManager manager) {
		
		this.accNo = accNo;
		this.holderName = holderName;
		this.accType = accType;
		this.ifscCode = ifscCode;
		this.branchLocation = branchLocation;
		this.manager = manager;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", holderName=" + holderName + ", accType=" + accType + ", ifscCode="
				+ ifscCode + ", branchLocation=" + branchLocation + ", manager=" + manager + "]";
	}

}
