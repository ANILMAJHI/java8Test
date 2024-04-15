package com.java.demo;

public interface InfDemo {

	public void m1();
	default void m2() {
		System.out.println("default method...");
	}
	static void m3() {
		System.out.println("static method...");
	}
}
