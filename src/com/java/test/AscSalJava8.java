package com.java.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AscSalJava8 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(100, "Anil", "Angul", 150));
		list.add(new Employee(101, "Ganesh", "CTC", 110));
		list.add(new Employee(102, "Shiva", "BBSR", 130));
		list.add(new Employee(103, "Ram", "DKL", 170));
		list.add(new Employee(109, "zara", "PUNE", 260));
		list.add(new Employee(104, "Hari", "PUNE", 160));

		//2nd highest salary
		Optional<Employee> e=list.stream().sorted((s1,s2)->s1.getSalary()-s2.getSalary()).skip(1).findFirst();
		
		//descending order
		list.stream().sorted(Comparator.comparing(Employee::getAddress).thenComparing(Employee::getName)).forEach(System.out::println);
		
		//System.out.println("e:"+e);
		
		Optional<Employee> soEmployees = list.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2).findFirst();
		//System.out.println(soEmployees);
		// 2nd highest salary
		List<Employee> emplist1 = (List<Employee>) list.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
				.skip(1).limit(1).collect(Collectors.toList());
		if (!emplist1.isEmpty()) {
			Employee em = emplist1.get(0);
			System.out.println("em: " + em);
		} else {
			System.out.println("not found elements...");
		}
		// String emplist=
		// list.stream().sorted((emp1,emp2)->emp1.getSalary()-emp2.getSalary()).skip(3).findAny().map(Employee::getName).get();
		List<Employee> emplist = list.stream().sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary()).skip(3)
				.collect(Collectors.toList());

		@SuppressWarnings("unchecked")
		List emp = (List) list.stream().sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
				.collect(Collectors.toList());

		// System.out.println("list of: " + emplist.get(0));
	}
}
