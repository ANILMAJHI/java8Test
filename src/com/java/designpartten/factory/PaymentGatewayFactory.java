package com.java.designpartten.factory;

public class PaymentGatewayFactory {

	public static PaymentGateway createPaymentGateway(String getewayType) {
		switch (getewayType) {
		case "PayPal":
			return new PayPalGateway();
		case "PhonePe":
			return new PhonePeGateway();
		case "GooglePay":
			return new GooglePayGateway();
		default:
			throw new IllegalArgumentException("Invalid gateway type:" + getewayType);
		}
	}

}
