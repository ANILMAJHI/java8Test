package com.java.designpartten.abstractfactory;

public class PaypalPayment implements PaymentMethod {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub

	}

	private String email;

	public PaypalPayment(String email) {
		super();
		this.email = email;
	}

}
