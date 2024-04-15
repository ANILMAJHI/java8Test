package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ETest1 {

	public static void main(String[] args) {


		List<Employee> hm = new ArrayList<Employee>();

		// hm.add(new Employee(0, null, null))
		hm.add(new Employee(1001, "Anil", "odisha", 10000));
		hm.add(new Employee(1002, "Siva", "hYd", 30000));
		hm.add(new Employee(1003, "Ram", "bangaLore", 40000));
		hm.add(new Employee(1004, "Bubuna", "puNe", 20000));
		hm.add(new Employee(1009, "Bunu", "puNe", 80000));
		hm.add(new Employee(1006, "Basudev", "bbsr", 90000));
		hm.add(new Employee(1009, "Samal", "bbsr", 50000));
		
		//System.out.println(hm);
		//hm.stream().sorted(Comparator.comparing(Employee::getAddress).thenComparing(Employee::getSalary)).forEach(System.out::println);
		//hm.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		OptionalInt higEmployees=hm.stream().mapToInt(Employee::getSalary).max();
		//System.out.println(higEmployees);
		
		Optional<Employee> ts=hm.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		//System.out.println(ts);
		
		Map<String, Long> d=hm.stream().collect(Collectors.groupingBy(Employee::getAddress, Collectors.counting()));
		//System.out.println(d);
		//hm.stream().filter(s->s.getAddress().equals("puNe")).forEach(System.out::println);
		
		Map<String, List<Employee>> aEmployees=hm.stream().collect(Collectors.groupingBy(Employee::getAddress));
		aEmployees.forEach((v1,v2)->{
			//System.out.println(v1+":"+v2);
		});
		//System.out.print(aEmployees);
	}

}
