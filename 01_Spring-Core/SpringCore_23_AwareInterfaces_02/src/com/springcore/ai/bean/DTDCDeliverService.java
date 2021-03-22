package com.springcore.ai.bean;

public class DTDCDeliverService implements IDelivery {

	@Override
	public void deliver(PersonInfo pinfo, OrderInfo oinfo, AddressInfo ainfo) {
		// TODO Auto-generated method stub
		System.out.println("Delivery handed over to DTDC..!!");
		System.out.println("Order got Delivered..!!");
		
	}

	
}
