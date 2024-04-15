package com.java.singleton;

public class DoubleCheckedSingleton implements Cloneable {

	/*
	 * if multiple threads try to create the instance at the same time, only one of
	 * them will be able to do so.
	 */
	private DoubleCheckedSingleton() {

	}

	private static volatile DoubleCheckedSingleton instance = null;

	public static DoubleCheckedSingleton getInstance() throws CloneNotSupportedException {
		if (instance == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedSingleton();
				}
			}
		}
		return instance;

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		DoubleCheckedSingleton d1 = DoubleCheckedSingleton.getInstance();
		DoubleCheckedSingleton d2 = DoubleCheckedSingleton.getInstance();
		System.out.println(d1.hashCode());
		System.out.println(d1.hashCode());

	}

}
