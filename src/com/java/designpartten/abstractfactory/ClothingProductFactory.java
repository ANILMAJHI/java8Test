package com.java.designpartten.abstractfactory;

public class ClothingProductFactory implements ECommerceFactory {

	@Override
	public Product createProduct() {
		return new ClothingProduct("Jeans", 1200);
	}

	@Override
	public PaymentMethod createPaymentMethod() {
		return new CreditCardPayment("9870-1234-5678-1928");
	}

}
