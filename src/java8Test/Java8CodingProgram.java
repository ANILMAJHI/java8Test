package java8Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8CodingProgram {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 98, 25);

		Set<Integer> s1 = new HashSet<>();
		myList.stream().filter(s -> !s1.add(s)).forEach(System.out::println);

		// find the unique no.
		// myList.stream().distinct().forEach(System.out::println);

		// find out all the even numbers

		List<Integer> evenNO = myList.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		// System.out.println(evenNO);

		// find out all the numbers starting with 1
		List<String> stNO = myList.stream().map(s -> s + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		
		// System.out.println(stNO);

		Set<Integer> s = new HashSet<>();
		// find duplicate elements in a given integers
		Set<Integer> dupNO = myList.stream().filter(a -> !s.add(a)).collect(Collectors.toSet());
		// System.out.println(dupNO);

		// find the first element of the list
		Optional<Integer> fs = myList.stream().findFirst();
		// System.out.println(fs);
		// myList.stream().findFirst().ifPresent(System.out::println);

		// sum of the list
		int sum = myList.stream().mapToInt(Integer::valueOf).sum();
		// System.out.println("sum:"+sum);

		// find the total number of elements present in the list
		Long count = myList.stream().count();
		// System.out.println(count);

		// find the maximum value element present

		Optional<Integer> max = myList.stream().max(Comparator.comparingInt(Integer::valueOf));
		OptionalInt maw=myList.stream().mapToInt(Integer::valueOf).max();
		//System.out.println(maw);
		// System.out.println(max);

		int i = myList.stream().min(Integer::compare).get();
		// System.out.println(i);

		// sort all the values present in reverse
		 //myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// sort all the values present
		List<Integer> sort = myList.stream().sorted().collect(Collectors.toList());
		// System.out.println(sort);

		// sort all the values present in it in descending order
		List<Integer> sortDe = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		// System.out.println(sortDe);

	}
}
