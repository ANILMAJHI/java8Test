package com.java.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEmpMain implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		String address1 = o1.getAddress();
		String address2 = o2.getAddress();

		return address1.compareTo(address2);
	}

	public static void employeeprocess() {
		// ArrayList<Employee> employees = new ArrayList<>(new ComparatorEmpMain());
		TreeSet<Employee> employees = new TreeSet<>(new ComparatorEmpMain());
		employees.add(new Employee(1, "anil", "Angul", 30000));
		employees.add(new Employee(2, "pinku", "Cuttack", 12000));
		employees.add(new Employee(5, "Hari", "Puri", 50000));
		employees.add(new Employee(3, "Dhaba", "Bbsr", 15000));
		for(Employee emp:employees )
		{
			System.out.println(emp);
		}
	}

	public static void main(String[] args) {

		employeeprocess();
	}

}
