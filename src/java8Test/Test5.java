package java8Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		List<Integer> ll = Arrays.asList(3, 4, 6, 9);

		Stream<Integer> stream = Stream.concat(l.stream(), ll.stream());
		List<Integer> list = stream.collect(Collectors.toList());
		OptionalInt d1 = list.stream().mapToInt(Integer::valueOf).min();
		System.out.println(d1);
		System.out.println(list);

		OptionalDouble sq = ll.stream().mapToInt(s -> s * s).filter(s -> s >= 30).average();
		 System.out.println("squre:" + sq);

		// find out all the even numbers
		List<Integer> even = l.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		// System.out.println("even no: " + even);
		List<Integer> every2ndEven = IntStream.range(0, even.size()).filter(i -> i % 2 == 0).mapToObj(even::get)
				.collect(Collectors.toList());

		ArrayList<Integer> al = new ArrayList<>();
		for (int j = 0; j < even.size(); j = j + 2) {

			al.add(even.get(j));
		}
		// System.out.println(al);

		 System.out.println("every2ndEven: "+every2ndEven);

		List<String> stList = l.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
		// System.out.println(stList);

		Set<Integer> s = new HashSet<>();
		List<Integer> noneveno = l.stream().filter(i -> !s.add(i)).collect(Collectors.toList());
		// System.out.println(noneveno);

		// find the first element of the list
		// l.stream().findFirst().ifPresent(System.out::println);

		// find the total number of elements
		long d = l.stream().count();
		// System.out.println(d);

		// find the maximum value
		Optional<Integer> ld = l.stream().max(Comparator.comparing(Integer::valueOf));
		Optional<Integer> dd = l.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
		l.stream().mapToInt(Integer::valueOf).max();
		// System.out.println(ld);

		// l.stream().sorted().forEach(System.out::println);
		// l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}
}
