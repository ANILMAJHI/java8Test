package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing8 {

	public static void main(String[] args) {

		List<Integer> d = Arrays.asList(2, 3, 4, 5, 23, 7, 6);

		d.stream().filter(s -> s % 2 == 0).mapToInt(Integer::valueOf).forEach(System.out::println);
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		System.out.println(str1.hashCode() + " " + str2.hashCode());// same
		System.out.println(str1.hashCode() + " " + str3.hashCode());// no
		System.out.println(str3.hashCode() + " " + str4.hashCode());// no
		System.out.println(str1.equals(str2));// true
		System.out.println(str1.equals(str3));// false
		System.out.println(str3.equals(str4));// false

	}
}
