package com.springcore.ba.bean;

public class BlueDartDeliveryService implements IDelivery {

	@Override
	public void deliverProduct(OrderInfo orderinfo, PersonInfo personinfo, ShippingAddress addr) {
		// TODO Auto-generated method stub
		System.out.println("Delivery hand over to BLUE DART..");
		System.out.println("Order Delivered : " + orderinfo.getOrderId());
		
	}

	

}
