package com.java.designpartten.abstractfactory;

public interface ECommerceFactory {

	Product createProduct();
	PaymentMethod createPaymentMethod();
	
}
