package java8Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(2, 3, 4, 5, 1, 5, 3, 6, 7, 9, 9);
		int [] no= {2, 3, 4, 5, 1, 5, 3, 6, 7, 9, 9};
		
		//long snu=Arrays.stream(no).filter(s->s%2==0).sum();
		long snu=Arrays.stream(no).filter(s->s%2==0).mapToLong(Integer::valueOf).sum();
		//int snu=number.stream().filter(s->s%2==0).mapToInt(Integer::valueOf).sum();
		//System.out.println("snu:"+snu);
		
		List<Integer> nos=number.stream().distinct().collect(Collectors.toList());
		//System.out.println("nos: "+nos);
		// int e=number.stream().map(s->s*s).filter(s->s%2==0).mapToInt(Integer::valueOf).sum();
		 int e=number.stream().filter(s->s%2==0).mapToInt(Integer::valueOf).sum();
		 //System.out.println(e);
		 

		List<Integer> ss = number.stream().map(s -> s * s * s).filter(s -> s > 40).distinct().collect(Collectors.toList());
		// System.out.println("ss "+ss);

		List<Integer> ro = number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 //System.out.println(ro);
		// Optional<Integer> max =
		// number.stream().max(Comparator.comparingInt(Integer::intValue));
		OptionalInt se = number.stream().mapToInt(Integer::valueOf).max();
		Long count = number.stream().count();
		// System.out.println(count);

		// System.out.println("max value :" +max);

		// number.stream().map(s -> s + "").filter(a ->
		// a.startsWith("9")).forEach(System.out::println);
		// number.stream().sorted().map(s->s).distinct().forEach(System.out::print);

		// number.stream().distinct().forEach(System.out::println);

		List<Integer> l = number.stream().sorted().collect(Collectors.toList());
		// System.out.println(l);

		// reverOrder
		// number.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;

		number.stream().mapToInt(Integer::valueOf).max();
		number.stream().max(Comparator.comparing(Integer::valueOf)).get();

		Function<String, Integer> p = s -> s.length();
		// System.out.println(p.apply("microservices"));

		int min = l.stream().min(Comparator.comparing(Integer::intValue)).get();
		// System.out.println("min: "+min);

		int n = number.stream().mapToInt(Integer::intValue).sum();
		// System.out.println(n);

		// OptionalInt l1 = number.stream().mapToInt(Integer::intValue).max();
		Integer l1 = number.stream().max(Comparator.comparing(Integer::intValue)).get();
		// System.out.println(l1);

		// .parallelStream().forEach(System.out::println);

		// number.stream().map(s -> s * s).forEach(System.out::println);

		List<Integer> l2 = number.parallelStream().map(s -> s * s).collect(Collectors.toList());

		// System.out.println(l2);

		
		  Optional<Integer> l12 = number.stream().min(Comparator.naturalOrder());
		  System.out.println(l12);
		 

		// find the sum of the all the even no.
		// -0009unumber.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
		int sum = number.stream().filter(s -> s % 2 == 0).mapToInt(Integer::valueOf).sum();

		// System.out.println(sum);

		// find the length of the longest string in a list of strings.

		List<String> strings = Arrays.asList("foo", "barsdfsd", "baz", "qux");
		int le = strings.stream().mapToInt(String::length).max().orElse(0);
		 System.out.println("le: "+le);


			 
		// sort a list of strings in alphabetical order.
		// strings.stream().sorted().forEach(System.out::println);

		// remove all duplicates from a list of integers.

		// number.stream().distinct().forEach(System.out::println);

		//

	//	strings.stream().map(s -> s + "").filter(a -> a.startsWith("f")).forEach(System.out::println);
	/*
	 * Optional<String> result = strings.stream().filter(s ->
	 * s.startsWith("b")).findFirst(); if (result.isPresent()) {
	 * System.out.println(" " + result.get()); } else {
	 * System.out.println("String not found."); }
	 */

	}
}
