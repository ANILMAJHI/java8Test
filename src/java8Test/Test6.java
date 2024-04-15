package java8Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {

	public static void main(String[] args) {

		int[] num = { 2, 3, 4, 1, 6, 9, 7, 4, 0 };
	
		List<Integer> l = Arrays.asList(2, 3, 4, 1, 6, 9, 7, 1, 0);

		// find the sum of even no.
		int sumEve = Arrays.stream(num).filter(s -> s % 2 == 0).distinct().sum();
		// System.out.println("even sum:" + sumEve);//

		// find the square of sum of all the even no
		int sumevensq = Arrays.stream(num).filter(s -> s % 2 == 0).map(s -> s * s).sum();
		// System.out.println("sumevensq: "+sumevensq);

		// find the 2nd highest odd no

		OptionalInt secint = l.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::valueOf).skip(1)
				.findFirst();
		// System.out.println("sendhigetst: " + secint);

		Optional<Integer> secint1 = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		// System.out.println("sendhigetst: " + secint);

		// find the sum of all the no.
		int sum = l.stream().mapToInt(Integer::valueOf).sum();
		// System.out.println("sum:"+sum);

		// find the 2nd highest odd no -->output should be 7
		Optional<Integer> oddsechigets = l.stream().sorted(Comparator.reverseOrder()).filter(s -> s % 2 != 0).skip(1)
				.findFirst();
		// System.out.println("second higest no: "+oddsechigets);

		// sorting all the no with unique no
		// l.stream().sorted().distinct().forEach(System.out::println);

		// highest no of the list
		OptionalInt higetst = l.stream().mapToInt(Integer::valueOf).max();
		// System.out.println("highest "+higetst);

		// find the duplicate value of the list
		Set<Integer> s = new HashSet<>();
		// l.stream().filter(a -> !s.add(a)).forEach(System.out::println);

		// find out all the numbers starting with 4
		// l.stream().map(x -> x + "").filter(a ->
		// a.startsWith("4")).forEach(System.out::println);
	}

}
