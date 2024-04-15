package com.java8.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testing1 {

	public static void main(String[] args) {

		String str = "This is world Is";

		Map<String, Long> cont = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> cont1 = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		//System.out.println(cont1);
		
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 98, 25);
		
		Set<Integer> et=myList.stream().collect(Collectors.toSet());
		System.out.println("et:"+et);
		//find unique no.
		//myList.stream().mapToInt(Integer::valueOf).distinct().forEach(System.out::println);
		
		//find out all the even numbers
		//myList.stream().filter(s->s%2==0).forEach(System.out::println);
		// find out all the numbers starting with 1
		
		//myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		
		// find duplicate elements in a given integers
		Set<Integer> a=new HashSet<>();
		//myList.stream().filter(s->!a.add(s)).forEach(System.out::println);
		
		// find the first element of the list
		//myList.stream().findFirst().ifPresent(System.out::println);
		
		// sum of the list
		int sum=myList.stream().mapToInt(Integer::valueOf).sum();
	//	System.out.println(sum);
		
		// find the total number of elements present in the list
		
		long sum1=myList.stream().mapToInt(Integer::valueOf).count();
		//System.out.println(sum1);
		
		// find the maximum value element present
		Optional<Integer> ma=myList.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
		//System.out.println(ma);
		
		// sort all the values present in reverse
		myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		
		
		
	}

}
