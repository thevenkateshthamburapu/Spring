package com.springcore.ai.bean;

public class BlueDartDeliverService implements IDelivery {

	@Override
	public void deliver(PersonInfo pinfo, OrderInfo oinfo, AddressInfo ainfo) {
		// TODO Auto-generated method stub
		System.out.println("Delivery handed over to BlueDart..!!");
		System.out.println("Order got Delivered..!!");
		
	}

}
