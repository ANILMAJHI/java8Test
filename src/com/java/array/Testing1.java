package com.java.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.stream.LongStream;

public class Testing1 {

	public static void main(String[] args) {

		int[] num = { 2, 3, 4, 1, 6, 9, 7, 4, 0 };
		//Arrays.stream(num).filter(s -> s % 2 == 0).mapToLong(Integer::valueOf).forEach(System.out::println);

		long sum = Arrays.stream(num).filter(s -> s % 2 == 0).mapToLong(Integer::valueOf).sum();
		//System.out.println(sum);

		OptionalLong max=Arrays.stream(num).mapToLong(Integer::valueOf).max();
		//System.out.println(max);
		
		//2nd higest no of the arrays
		OptionalLong secondMax=Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).mapToLong(Integer::valueOf).skip(1).findFirst();
		System.out.println(secondMax);
		//sorting arrays des
		//Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//
		//Arrays.stream(num).filter(s->s%2==0).map(s->s*s).forEach(System.out::println);
		
		//remove duplicate no
		//Arrays.stream(num).distinct().forEach(System.out::println);
		
		//find duplicate no
		Set<Integer> s=new HashSet<>();
		//Arrays.stream(num).filter(a->!s.add(a)).forEach(System.out::println);
		
		//count
		long count=Arrays.stream(num).count();
		//System.out.println(count);
		
		
		
	}

}
