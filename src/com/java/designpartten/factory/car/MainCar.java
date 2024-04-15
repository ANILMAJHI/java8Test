package com.java.designpartten.factory.car;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car=CarFactory.createCar("Maruti");
		car.buy();
		//System.out.println(car);
	}

}
