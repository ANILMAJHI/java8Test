package com.java.interviewQ;

import java.io.IOException;

class parant {
	public void m1(Object i)throws Exception {
		System.out.println("parant");
	}
}

class child extends parant {
	public void m1(String i)throws Exception {
		System.out.println("parant");
	}

}

public class Testing2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// parant p=new parant();
		parant c = new parant();
		c.m1(null);

	}

}
