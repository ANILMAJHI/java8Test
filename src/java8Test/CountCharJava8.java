package java8Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharJava8 {

	public static void main(String[] args) {

		String str = "I not love java I love";
		// splitting a string into words, using \\s+ ensures that consecutive whitespace
		// characters are treated as a single delimiter.

		Map<String, Long> mal=Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mal);
		Map<String, Long> count1 = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//System.out.println("count1:" + count1);
		
		Map<String, Integer> wordLengths = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.toMap(Function.identity(), String::length, (existing, replacement) -> existing));
		wordLengths.forEach((word, length) -> System.out.println(word + ": " + length));
			
//		String ch[]=str.split("");
//		System.out.println(Arrays.toString(ch));

		/*
		 * Map<String, Long> count = Arrays.stream(str.split(""))
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 */
		Map<String, Long> count = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//System.out.println(count);
	}

}
