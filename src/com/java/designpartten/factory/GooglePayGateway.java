package com.java.designpartten.factory;

public class GooglePayGateway implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("processing GooglePay payment of $:"+ amount);
		
	}

}
