package com.java.designpartten.abstractfactory;

public class CreditCardPayment implements PaymentMethod {

	private String cardNo;

	public CreditCardPayment(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("processing credit card payment of $ " + amount + " with card number is:" + cardNo);

	}

}
