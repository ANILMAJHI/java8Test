package com.java.designpartten.factory;

public interface PaymentGateway {
	
	// The Factory Design Pattern is a creational design pattern that provides an
	// interface for creating instances of a class, but it allows subclasses to
	// alter the type of objects that will be created

	void processPayment(double amount);
}
