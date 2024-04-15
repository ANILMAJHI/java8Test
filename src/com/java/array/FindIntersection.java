package com.java.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindIntersection {

	public static void main(String[] args) {

		int num1[]= {1, 2, 3, 4, 5};
		int num2[]= {3, 4, 5, 6, 7};
		
		Set<Integer> n1=Arrays.stream(num1).boxed().collect(Collectors.toSet());
		
		Set<Integer> n2=Arrays.stream(num2).boxed().filter(n1::contains).collect(Collectors.toSet());
		System.out.println(n2);
		
	}

}
