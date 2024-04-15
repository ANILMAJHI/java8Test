package com.java.designpartten.factory;

public class PayPalGateway implements PaymentGateway {

	@Override
	public void processPayment(double amount) {

		System.out.println("processing paypal payment $:" + amount);

	}

}
