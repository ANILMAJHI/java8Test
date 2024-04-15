package java8Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class java8Demo {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		// System.out.println("hello");

		/*
		 * ArrayList<Integer> al = new ArrayList<Integer>(); al.add(2); al.add(21);
		 * al.add(22);
		 * 
		 * al.add(12); al.add(43);
		 */

		ArrayList<String> al = new ArrayList<String>();
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("ee"); // List<Integer>
// list
		// al.stream().forEach(s -> System.out.println("Iterating:" + s));

		// = al.stream().filter(s->s%2==0).collect(Collectors.toList());

		al.stream().filter(s -> s.startsWith("e")).forEach(System.out::println);

		// List<String> list = al.stream().map(s ->
		// s.toUpperCase()).collect(Collectors.toList());
		List<String> list = al.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

		Map<Integer, String> customers = new HashMap<>();
		customers.put(1, "Jhon");
		customers.put(2, "Smith");
		customers.put(3, "Sally");

		customers.entrySet().stream().forEach((s -> {
			System.out.println("key:" + s.getKey() + "," + s.getValue().startsWith("Smith"));
		}));

		customers.entrySet().stream().filter(s -> s.getValue().equalsIgnoreCase("smith")).forEach(System.out::println);
		// customers.entrySet().stream().forEach(e -> System.out.println("Key:" +
		// e.getKey() + " Value:" + e.getValue()));

		// System.out.println(list);

	}

}
