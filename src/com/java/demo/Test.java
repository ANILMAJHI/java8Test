package com.java.demo;
//inheritance concept

class Parant {
	public void m1() {
		System.out.println("Parant class m1 method");
	}
}

class Child extends Parant {
	public void m1() {
		System.out.println("child class m1 method");
	}
}

public class Test {

	public static void main(String[] args) {

		Parant p=new Parant();
		Child c=new Child();
		Parant pc=new Child();
		p.m1();
		c.m1();
		//c.m2();
		pc.m1();
	}

}
