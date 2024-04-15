package com.java.designpartten.factory.car;

public class CarFactory {

	public static Car createCar(String company) {
		switch (company.toLowerCase()) {
		case "toyoto":
			return new ToyotaCar();
		case "tata":
			return new TataCar();
		case "maruti":
			return new MarutiCar();
		default:
			throw new IllegalArgumentException("Not Avaiable car" + company);
		}

	}
}
