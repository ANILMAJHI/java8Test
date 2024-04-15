package com.java.designpartten.abstractfactory;

public class ElectronicProduct implements Product {

	private String name;
	private double price;

	@Override
	public String toString() {
		return "ElectronicProduct [name=" + name + ", price=" + price + "]";
	}

	public ElectronicProduct() {
		super();
	}

	public ElectronicProduct(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
