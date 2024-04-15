package com.java.interviewQ;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 6; i++) {
			
			System.out.println("child thread running...");
		}
	}
}

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 6; i++) {
			t.join();
			System.out.println("main thread running...");
		}

	}
}
