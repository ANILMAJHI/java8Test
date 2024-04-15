package com.java.interviewQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Coding {

	public static void main(String[] args) {
		/*
		 * Random r=new Random(); r.ints().limit(5).forEach(System.out::println);
		 */

		List<String> str = Arrays.asList("Hello", "Interview", "Questions", "Answers");
		// str.stream().forEach(System.out::println);
		// Java 8 program to Count Strings whose length is greater than 3 in List?
		// str.stream().filter(s->s.length()>6).forEach(System.out::println);
		// System.out.println(l);

		// Java 8 program to find the Minimum number of a Stream?
		 List<Integer> list=Arrays.asList(21,43,63,18,86,-74,55,63,43);
		//List<Integer> list = Arrays.asList(2, 3, 4, 5);
		
		// int n=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		// System.out.println(n);
		
		// Java 8 program to multiply 3 to all element in list and print the list?
		//list.stream().map(s->s*3).forEach(System.out::println);
		
		//divided by 3
		// list.stream().filter(s->s%3==0).forEach(System.out::println);

		// Java 8 program to remove the duplicate elements from the list?
		 //list.stream().distinct().forEach(System.out::println);

		 //find the duplicate no using java8
		 Set<Integer> set=new HashSet<>();
		 list.stream().filter(s->!set.add(s)).forEach(System.out::println);
		 
		// Java 8 program to sort the given list?
		// list.stream().sorted().distinct().forEach(System.out::println);

		// Write a Java 8 program to get the sum of all numbers present in a list?
		int s = list.stream().mapToInt(Integer::valueOf).sum();
		// System.out.println(s);

		// Java 8 program to perfrom cube on list elements and filter numbers greater
		// than 50.
		//list.stream().map(i -> i * i * i).filter(i -> i > 27).forEach(System.out::println);
	}

}
