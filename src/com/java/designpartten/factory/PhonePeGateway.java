package com.java.designpartten.factory;

public class PhonePeGateway implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("processing PhonePe payment of $:"+ amount);
		
	}

}
