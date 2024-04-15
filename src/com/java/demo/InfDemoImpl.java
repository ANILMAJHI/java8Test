package com.java.demo;

public class InfDemoImpl implements InfDemo, InfDemo1 {
	@Override
	public void m1() {
		
		System.out.println("abstract method..");
		
	}
	
	public static void m3()
	{
		System.out.println("implementation class static method...");
	}
	public static void main(String[] args) {

		InfDemoImpl t=new InfDemoImpl();
		t.m1();
		t.m2();
		InfDemo.m3();
		m3();
	}

	

}
