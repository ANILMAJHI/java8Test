package com.java.test;

public class Test6 {

	private int id;
	private String name;
	
	public Test6(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	public int hashCode() {

		return id;
	}

	public String toString() {
		return name + "";
	}

	public static void main(String[] args) {

		Test6 t=new Test6(1,"ram");
		
		System.out.println(t);
		
	}
}
