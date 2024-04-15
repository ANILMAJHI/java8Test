package com.java.designpartten.factory;

public class ECommerceApp {

	public static void main(String[] args) {
	
		//PaymentGatewayFactory factory = new PaymentGatewayFactory();
		PaymentGateway payPalGateway = PaymentGatewayFactory.createPaymentGateway("PayPal");
		PaymentGateway googlePayGateway = PaymentGatewayFactory.createPaymentGateway("GooglePay");
		payPalGateway.processPayment(200);
		googlePayGateway.processPayment(100);
	}

}
