package com.java8.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testing {

	public static void main(String[] args) {
		String str = "This is world Is";

		// max length of the string
		OptionalInt strlength = Arrays.stream(str.split(" ")).mapToInt(String::length).max();
		System.out.println("strlength " + strlength);

		// count the char of the str
		Map<String, Long> coM = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(coM);

		// count the word of the str
		Map<String, Long> d4 = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		System.out.println("de " + d4);

		// each word count word
		Map<String, Integer> wordLengths = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.toMap(Function.identity(), String::length, (existing, replacement) -> existing));
		// wordLengths.forEach((word, length) -> System.out.println(word + ": " +
		// length));
		System.out.println("wordLengths: " + wordLengths);

		List<String> strings = Arrays.asList("foo", "barsdfsd", "baz", "qux");

		// max length of the string
		int le = strings.stream().mapToInt(String::length).max().orElse(0);
		System.out.println("le: " + le);

	}

}
