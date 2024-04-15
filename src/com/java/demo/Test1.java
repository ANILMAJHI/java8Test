package com.java.demo;

public class Test1 {
	public static void main(String[] args) {
		
		int num=1234593746;
		int s=String.valueOf(num).length();
		
		int count=0;
		for (int j = 1; j <= s; j++) {
			
			count++;
			
		}
		System.out.println(count);
	}

}
