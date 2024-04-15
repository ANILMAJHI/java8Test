package com.java.test;

class customerException extends RuntimeException {

	private int age;

	customerException() {

	}

	customerException(String name) {
		super(name);

	}
}

class customerExceptionOld extends RuntimeException {

	private int age;

	customerExceptionOld() {

	}

	customerExceptionOld(String name) {
		super(name);

	}

}

public class CustomizeException {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("usge: java customze exception age");
			return;
		}
		int age = Integer.parseInt(args[0]);
		age=54;
		if (age > 18) {
			throw new customerException("able to vote");
		} else if (age < 18) {
			throw new customerException("not able to vote");
		} else {
			System.out.println("too old person");
		}
	}

}
