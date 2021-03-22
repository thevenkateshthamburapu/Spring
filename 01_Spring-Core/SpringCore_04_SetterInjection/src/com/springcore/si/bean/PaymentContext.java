package com.springcore.si.bean;

public class PaymentContext {
	private IPayment paymentService;

	
	
	public void setPaymentService(IPayment paymentService) {
		this.paymentService = paymentService;
	}



	public void payBill(Double amount, int pin) {
		boolean status=paymentService.pay(amount, pin);
		System.out.println("Payment Completed : " + status);
	}

}
