package com.java.test;

public class Test5 {

	public static void main(String[] args) {

		String name = "anil321maj4hi";

		int sumOfDigits = 0;
		for (char c : name.toCharArray()) {
			if (Character.isDigit(c)) {
				sumOfDigits += Character.getNumericValue(c);
			}
		}

		System.out.println("Sum of digits: " + sumOfDigits);
	}
}
