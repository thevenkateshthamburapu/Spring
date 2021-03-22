package com.springcore.ba.bean;

public class DTDCDeliveryService implements IDelivery {

	@Override
	public void deliverProduct(OrderInfo orderinfo, PersonInfo personinfo, ShippingAddress addr) {
		// TODO Auto-generated method stub
		System.out.println("Delivery hand over to DTDC..");
		System.out.println("Order Delivered : " + orderinfo.getOrderId());
	}

}
