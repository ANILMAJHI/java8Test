package com.java.designpartten.abstractfactory;

public class ClothingProduct implements Product {

	private String name;
	private double price;

	@Override
	public String toString() {
		return "ClothingProduct [name=" + name + ", price=" + price + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ClothingProduct(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public ClothingProduct() {
		super();
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
