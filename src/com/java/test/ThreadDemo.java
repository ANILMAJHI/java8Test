package com.java.test;

class ChildThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread running...");
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {

		ChildThread t = new ChildThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread running...");
		}
	}

}
