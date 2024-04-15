package com.java.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int[] num = { 2, 3, 4, 1, 6, 9, 7, 4, 0 };

		// sorting order
		// Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		// find the sum of even no.
		int sumEve = Arrays.stream(num).filter(s -> s % 2 == 0).distinct().sum();
		// System.out.println("even sum:" + sumEve);//

		// find the square of sum of all the even no
		int sumevensq = Arrays.stream(num).filter(s -> s % 2 == 0).map(s -> s * s).sum();
		// System.out.println("sumevensq: "+sumevensq);

		// find the max in the array
		OptionalLong max = Arrays.stream(num).mapToLong(Integer::valueOf).max();
		// System.out.println(max);

		// Arrays.stream(num).filter(s -> s % 2 ==
		// 0).mapToLong(Integer::valueOf).forEach(System.out::println);

		int[] num1 = { 1, 2, 2, 2, 3, 3, 3, 3, 5, 5, 5, 5, 5 };

		Map<Integer, Long> count = Arrays.stream(num1).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		count.forEach((valu, counts) -> {
			if (counts > 1) {
				System.out.println(valu + ":" + counts);
			}
		});
	}

}
