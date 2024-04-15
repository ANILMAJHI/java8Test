package com.java.designpartten;

public class DeveloperClient {

	public static void main(String[] args) {
		Employee emp = EmployeeFactory.getEmployee("java developer");
		int sal = emp.salary();
		System.out.println(sal);
	}
}
