package com.java.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * public int hashcode() { return id; }
	 * 
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * super.hashCode(); }
	 * 
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub return super.equals(obj); }
	 */

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Employee> employeeMap = new HashMap<>();
		
		Employee emp1 = new Employee(1, "John", 50000.0);
		Employee emp2 = new Employee(2, "Alice", 60000.0);
		Employee emp3 = new Employee(1, "John", 55000.0);

		
		employeeMap.put(emp1.getId(), emp1);
		employeeMap.put(emp2.getId(), emp2);
		employeeMap.put(emp3.getId(), emp3);

		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }

	}

}
