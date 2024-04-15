package com.java8.revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraysDetails {

	public static void main(String[] args) {

		int[] num = { 3, 4, 5, 2, 3, 7, 6, 4 };

		long count=Arrays.stream(num).boxed().count();
		System.out.println("count:"+count);
		
		//find the array start with 4
		List<String> sw=Arrays.stream(num).boxed().map(s->s+"").filter(s->s.startsWith("4")).collect(Collectors.toList());
		System.out.println("sw:"+sw);
		
		//2nd highest no of the arrays
		Optional<Integer> sechi=Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		//System.out.println("sechi:"+sechi);
		
		//find the max in the array
		OptionalInt max=Arrays.stream(num).boxed().mapToInt(Integer::valueOf).max();
		//System.out.println("max:"+max);
		
		//find the square of sum of all the even no
		List<Integer>  sqNo=Arrays.stream(num).boxed().filter(s->s%2==0).map(s->s*s).collect(Collectors.toList());
		//System.out.println("sqNo:"+sqNo);
		
		// count the numbers in arrays
		long arrcount = Arrays.stream(num).count();
		// System.out.println("arrcount:"+arrcount);

		// sorting arrays asc or desc
		List<Integer> sortList = Arrays.stream(num).boxed().sorted((s1, s2) -> -s1.compareTo(s2))
				.collect(Collectors.toList());
		// System.out.println("sortList:"+sortList);

		// find the sum of even no.
		long sum = Arrays.stream(num).boxed().mapToLong(Integer::valueOf).sum();
		//System.out.println("sum:" + sum);

		// find the common value in 2 array
		Map<Integer, Long> value = Arrays.stream(num).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// System.out.println(value);

		value.entrySet().forEach(v -> {
			if (v.getValue() <= 1) {
				 System.out.print(v.getKey()+",");
			}
		});

	}
}
