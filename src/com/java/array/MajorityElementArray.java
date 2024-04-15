package com.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElementArray {

	public static void main(String[] args) {

		int[] num = { 2, 2, 3, 2, 4, 2, 5, 2, 1, 1 };

		// Map<Integer, Long>
		// arr=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),
		// Collectors.counting()));
		// System.out.println(arr);

		// int
		// firstvalue=arr.entrySet().stream().filter(s->s.getValue()>num.length/2).map(Map.Entry::getKey).findFirst().orElse(-1);
		// System.out.println(firstvalue);

		// duplicate
		Set<Integer> s=new HashSet<>();
		for (int i = 0; i < num.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					s.add(num[i]);
					System.out.println(s);
					
				}
			}
			if (isDuplicate) {
				//System.out.println(num[i]);
			}

		}
	}

}
