package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8LowSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Anil", "Angul", 5000));
		empList.add(new Employee(2, "Subash", "Delhi", 7000));
		empList.add(new Employee(3, "Hari", "Bhadrak", 8000));
		empList.add(new Employee(4, "Pinku", "BBSR", 6000));
		empList.add(new Employee(5, "Rama", "Delhi", 5500));

		Map<String, Long> m=empList.stream().collect(Collectors.groupingBy(Employee::getAddress, Collectors.counting()));
		System.out.println(m);

		// empList.parallelStream().forEach(System.out::println);
		// empList.stream().filter(emp -> emp.getSalary() <
		// 6000).forEach(System.out::println);
		// empList.stream().sorted((e1, e2) -> e1.getSalary() -
		// e2.getSalary()).forEach(System.out::println);
		;

		List<Employee> l = empList.stream().sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
				.collect(Collectors.toList());
		//System.out.println(l);

		// Optional<Employee> li =
		// l.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		// System.out.println(li.get());

		// List<Employee> l2 =
		// l.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2)
//			//.collect(Collectors.toList());
		// System.out.println(l2.get(0));

	}

}
