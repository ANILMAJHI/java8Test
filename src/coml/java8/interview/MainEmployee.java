package coml.java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainEmployee {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Amar", "pune");
		Employee employee2 = new Employee("Raj", "pune");
		Employee employee3 = new Employee("Neha", "Mumbai");
		Employee employee4 = new Employee("Sam", "Mumbai");

		List<Employee> empList = Arrays.asList(employee1, employee2, employee3, employee4);

		//find city wise 
		Map<String, List<Employee>> e = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println(e);

	}

}
