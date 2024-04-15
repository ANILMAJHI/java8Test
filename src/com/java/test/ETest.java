package com.java.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ETest {

	public static void main(String[] args) {

		List<Employee> hm = new ArrayList<Employee>();

		// hm.add(new Employee(0, null, null))
		hm.add(new Employee(1001, "Anil", "odisha", 1000));
		hm.add(new Employee(1002, "Siva", "hYd", 3000));
		hm.add(new Employee(1003, "Ram", "bangaLore", 4000));
		hm.add(new Employee(1004, "Bubuna", "puNe", 2000));
		hm.add(new Employee(1004, "Bubuna", "puNe", 8000));
		hm.add(new Employee(1005, "Bubuna", "chennai", 6700));
		hm.add(new Employee(1006, "Basudev", "bbsr", 9000));
		
		// sorting revesed order based on salary
		// hm.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

		// 2nd highest salary of the list
		List<Employee> emplList = hm.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
				.collect(Collectors.toList());
		//System.out.print("2nd highest emloyee" + emplList.get(0));
		
		// sorting based on name
		// hm.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(System.out::println);

		// sorting based on name, if name is same then sorting based on address.
		// hm.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAddress)).forEach(System.out::println);
		   

		List<Employee> t = hm.stream().filter(s -> s.getName().startsWith("B") && s.getSalary() > 40000)
				.collect(Collectors.toList());
		// System.out.println("sort name and sal: "+t);

		Long l = hm.stream().count();
		// System.out.println(l);

		List<Employee> empl = hm.stream().filter(s -> s.equals("Bubuna")).collect(Collectors.toList());
		// hm.stream().filter(s->s.getName().equals("Anil")).forEach(System.out::println);
		// System.out.println(empl);
		List<Employee> sal = hm.stream().sorted((s1, s2) -> s1.getSalary() - s2.getSalary()).skip(0)
				.collect(Collectors.toList());

		List<Employee> se = hm.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
				.collect(Collectors.toList());
		// System.out.println("se: "+se.get(0));
		// 2nd higest salary
		//hm.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		// boxed() Convert back to Integer stream
		Integer hist = hm.stream().mapToInt(Employee::getSalary).distinct().boxed().sorted(Comparator.reverseOrder())
				.skip(1).collect(Collectors.toList()).get(0);
		List<Employee> em = hm.stream().filter(e -> e.getSalary() == hist).collect(Collectors.toList());
		// System.out.println("em "+em);
		// System.out.println(sal.get(0));
		Optional<Employee> sal1 = hm.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1)
				.findFirst();
		// System.out.println("sal1: "+sal1);

		List<String> ed = hm.stream().map(s -> s.getName()).distinct().collect(Collectors.toList());

		 System.out.println("ed"+ed); 

		// Optional<Employee>
		// e=hm.stream().min(Comparator.comparing(Employee::getSalary));
		Optional<Employee> e1 = hm.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		OptionalInt hisa=hm.stream().mapToInt(Employee::getSalary).max();
		//System.out.println("hisa"+hisa);

		// System.out.println(e1);
		// hm.stream().sorted((s1, s2) ->
		// s1.getName().compareTo(s2.getName())).forEach(System.out::println);
		List<Employee> soem = hm.stream().sorted((s1, s2) -> s1.getSalary() - s2.getSalary()).distinct()
				.collect(Collectors.toList());
		// System.out.println("sort emp: "+soem);

		List<Employee> l1 = hm.stream().sorted((s1, s2) -> s1.getSalary() - s2.getSalary()).skip(2)
				.collect(Collectors.toList());
		// System.out.println(l1.get(0));

		// Optional<Employee> l =
		// hm.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		// System.out.println(l);
		// hm.stream().filter(s1->s1.getSalary()>30000).forEach(System.out::println);

		// hm.stream().filter(s1 -> s1.getSalary()> 20000).forEach(System.out::println);
		Employee emp = null;

		Iterator<Employee> itr = hm.iterator();
		while (itr.hasNext()) {
			emp = itr.next();
			if (emp.getName().equalsIgnoreCase("ram")) {
				// System.out.println(emp);
			}
			// System.out.println(emp);
		}

		// Optional<Employee>
		// l=hm.stream().sorted((e1,e2)->e1.getSalary()-e2.getSalary()).skip(3).findFirst();

		//2nd lowest salary on the list
		Optional<Employee> emp1 = hm.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1)
				.findFirst();
		System.out.println("emp1:"+emp1);

		// Optional<Employee> l=
		// hm.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).skip(0).findFirst();

		// hm.stream().sorted((s1, s2) -> s1.getSalary() -
		// s2.getSalary()).forEach(System.out::println);
		// Optional<Employee> l=
		// hm.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

		// System.out.println(l);
	}

}
