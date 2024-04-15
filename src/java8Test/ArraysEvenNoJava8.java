package java8Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysEvenNoJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 1, 2, 3, 6, 4, 7, 3, 5, 7 };

		// find the sum of even no.
		Long sum12 = Arrays.stream(numbers).filter(s -> s % 2 != 0).map(s -> s * s).mapToLong(Integer::valueOf)
				.distinct().sum();
		// System.out.println("oddSqsum: "+sum12);

		int asum = (int) Arrays.stream(numbers).mapToLong(Integer::valueOf).sum();
		int s3 = Arrays.stream(numbers).filter(s -> s % 2 == 0).sum();
		double qs1 =Arrays.stream(numbers).mapToDouble(Integer::valueOf).sum();
		Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		// System.out.println("sum of s3 :"+s3);

		List<Integer> l = Arrays.asList(1, 2, 3, 6, 4, 7, 3, 5, 7);

		//find the value 2 and square it
		l.stream().filter(s -> s.equals(2)).map(s -> s * s * s).forEach(System.out::println);

		int sumof = l.stream().mapToInt(Integer::valueOf).sum();
		// System.out.println(sumof);
		// find the 2nd highest odd no
		OptionalInt idi = l.stream().sorted(Comparator.reverseOrder()).filter(s -> s % 2 != 0)
				.mapToInt(Integer::valueOf).distinct().skip(1).findFirst();
		// System.out.println("idi: "+idi);

		int sum = l.stream().filter(s -> s % 2 == 0).mapToInt(Integer::valueOf).sum();

		Optional<Integer> dw = l.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		// System.out.println(dw);

		String str = "this is the string value The this is";

		// l.stream().map(s->s+"
		// ").filter(s->s.startsWith("3")).forEach(System.out::print);
		// Count character
		Map<String, Long> dsd = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// System.out.println(dsd);

		// Count word
		// splits the string into an array of words based on one or more spaces
		// (i.e., it separates the words by spaces).
		// String::toLowerCase is a method reference that converts each word to
		// lowercase. This is done to ensure that words with different letter casing
		// (e.g., "This" and "this") are counted together as the same word.
		Map<String, Long> d4 = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		System.out.println("de " + d4);

		Map<String, Long> d1 = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("de1 " + d1);

		// l.stream().distinct().forEach(System.out::print);

		// 2nd higest no
		Optional<Integer> ue = l.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();
		// System.out.println(","+ue);

		// l.stream().filter(s->s%2==0).forEach(System.out::println);
		// l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		Set<Integer> ss = new HashSet<>();
		Optional<Integer> l2 = l.stream().min(Comparator.comparingInt(Integer::valueOf));
		// System.out.println(l2);
		// l.stream().filter(a->!ss.add(a)).forEach(System.out::println);
		Map<String, Long> value = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// System.out.println("valuse :" + value);
		List<Integer> ll = l.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		// System.out.println(ll);

		l.stream().min(Comparator.comparing(Integer::valueOf));
		l.stream().collect(Collectors.minBy(Comparator.comparing(Integer::valueOf)));
		l.stream().mapToInt(Integer::valueOf).sum();
		Optional<Integer> d = l.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();
		// System.out.println(d);
		// int sum=l.stream().mapToInt(Integer::valueOf).sum();
		List<Integer> sum11 = l.stream().distinct().collect(Collectors.toList());

		// System.out.println(sum);
		// List<Integer> sum=l.stream().sorted().collect(Collectors.toList());
		// List<Integer>
		// sum=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		// List<Integer> sum=l.stream().map(s->s*s).collect(Collectors.toList());
		// List<Integer> sum=l.stream().filter(s->s%2==0).collect(Collectors.toList());
		// List<String> sum = l.stream().map(s -> s + "").filter(s ->
		// s.startsWith("3")).collect(Collectors.toList());
		int sum1 = l.stream().findFirst().get();
		// System.out.println(sum1);

		// long sum= l.stream().count();
		// OptionalInt sum=l.stream().mapToInt(Integer::valueOf).max();
		// System.out.println(sum);
	}

}
