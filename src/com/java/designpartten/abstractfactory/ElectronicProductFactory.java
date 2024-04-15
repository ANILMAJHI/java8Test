package com.java.designpartten.abstractfactory;

public class ElectronicProductFactory implements ECommerceFactory {

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ElectronicProduct("watch", 300);
	}

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new CreditCardPayment("1234-8974-8367-7654");
	}

}
