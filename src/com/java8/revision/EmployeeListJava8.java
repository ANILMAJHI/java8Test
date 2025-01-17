package com.java8.revision;

import com.java8.revision.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeListJava8 {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// find the max sal each depart.
		Map<String, Optional<Employee>> deptMaxSalMaps = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		deptMaxSalMaps.entrySet().forEach(s -> {
			// System.out.println(s);

		});

		// find out the details who's department name is "Product Development"
		List<Employee> produlistList = employeeList.stream()
				.filter(s -> s.getDepartment().equalsIgnoreCase("Product Development")).collect(Collectors.toList());
		// System.out.println("produlistList: "+produlistList);

		// count the male and female employee
		Map<String, Long> countGender = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		// System.out.println("countGender:" + countGender);

		// list out all the departments in this list.
		List<String> deptList = employeeList.stream().map(s -> s.getDepartment()).distinct()
				.collect(Collectors.toList());
		// System.out.println("deptList:"+deptList);

		// highest salary
		Optional<Employee> higSal = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		// System.out.println(higSal);

		// count the depart
		long deptcount = employeeList.stream().map(s -> s.getDepartment()).distinct().count();
//		System.out.println("department count: " + deptcount);

		// Sales And Marketing male and female count
		Map<String, Long> countGenderMap = employeeList.stream()
				.filter(s -> s.getDepartment().equalsIgnoreCase("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(countGenderMap);

		// Those are joining after 2015
		List<Employee> datet = employeeList.stream().filter(s -> s.getYearOfJoining() > 2015)
				.collect(Collectors.toList());

		// System.out.println(datet);

		// find out the employee greater then 30 age
		List<Employee> datetage = employeeList.stream().filter(s -> s.getAge() > 30).collect(Collectors.toList());
		// System.out.println(datetage);

		// How many male and female employees are there in the organization?
		Map<String, Long> contgeMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		// System.out.println(contgeMap);

		// What is the average age of male and female employees?
		Map<String, Double> avaAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		// System.out.println(avaAge);

		// Count the number of employees in each department?
		Map<String, Long> deptcount1 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		// System.out.println(deptcount1);

		// What is the average salary of each department?

		Map<String, Double> avasaMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		// System.out.println(avasaMap);

		// Get the details of youngest male employee in the product development
		Map<String, Optional<Employee>> agemale = employeeList.stream()
				.filter(s -> s.getDepartment().equalsIgnoreCase("product development")
						&& s.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparing(Employee::getAge))));

//		System.out.println(agemale);

		// Who has the most working experience in the organization?
		Optional<Employee> expEmp = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		// System.out.println(expEmp);

		// How many male and female employees are there in the sales and marketing team?
		Map<String, Long> malefMap = employeeList.stream()
				.filter(s -> s.getDepartment().equalsIgnoreCase("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		// System.out.println(malefMap);

		// What is the average salary of male and female employees?
		Map<String, Double> avgsal = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//	System.out.println(avgsal);

	}

}
