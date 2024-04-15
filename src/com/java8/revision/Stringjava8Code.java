package com.java8.revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringjava8Code {

	public static void main(String[] args) {

		String str = "This is world Is";

		// max length of the string //[5]
		OptionalInt maxlInt = Arrays.stream(str.split(" ")).mapToInt(String::length).max();
		// System.out.println("maxlInt:"+maxlInt);

		// count the char of the str
		Map<Object, Long> countchar = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		//System.out.println("countchar:" + countchar);

		// count the char of the str

		// each word count word
		// Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::length,
		// Collectors.counting()));

		// start with 'b' letter
		List<String> startwi = Arrays.stream(str.split(" ")).map(s -> s + "").filter(s -> s.startsWith("w"))
				.collect(Collectors.toList());
		//System.out.println("startwi:" + startwi);
		
		//revesed string
		List<String> revList=Arrays.stream(str.split(" ")).sorted().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("revList: "+revList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
