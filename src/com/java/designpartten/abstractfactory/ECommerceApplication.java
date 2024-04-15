package com.java.designpartten.abstractfactory;

public class ECommerceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ECommerceFactory commerceFactory = new ElectronicProductFactory();
		Product electronicProduct = commerceFactory.createProduct();
		PaymentMethod method = commerceFactory.createPaymentMethod();

		System.out.println("Electronic Product: " + electronicProduct.getName() + ", " + "Price: $"
				+ electronicProduct.getPrice());
		method.processPayment(electronicProduct.getPrice());
		System.out.println();

		ECommerceFactory clothCommerceFactory = new ClothingProductFactory();

		Product clothingProduct = clothCommerceFactory.createProduct();
		PaymentMethod clothPaymentMethod = clothCommerceFactory.createPaymentMethod();

		System.out.println("Cloth Product Name: " + clothingProduct.getName() + "," + "Cloth Product price: "
				+ clothingProduct.getPrice());
		clothPaymentMethod.processPayment(clothingProduct.getPrice());

	}

}
