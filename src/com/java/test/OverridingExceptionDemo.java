package com.java.test;

import java.io.FileNotFoundException;
import java.io.IOException;

class Test {
	public void m1() throws NullPointerException {
		System.out.println("Test method1...");
	}
}

class Test1 extends Test {
	public void m1() throws RuntimeException {
		System.out.println("Test method1...");
	}
}

public class OverridingExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			int n = 10 / 0;
		} catch (NullPointerException e1) {
			// TODO: handle exception
		}
		catch (Exception e1) {
			// TODO: handle exception
		}

	}

}
