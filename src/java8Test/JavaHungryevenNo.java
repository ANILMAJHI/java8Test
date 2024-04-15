
package java8Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaHungryevenNo {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, -98, 10, 32, 15);

		Set<Integer> d = new HashSet<>();
		myList.stream().filter(s -> !d.add(s)).forEach(System.out::println);
		// List<Integer> myList = Arrays.asList(-10, -15, -8, 0);
		Optional m = myList.stream().max(Comparator.comparing(Integer::valueOf));
		// Optional
		// m=myList.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
		OptionalInt ii = myList.stream().mapToInt(Integer::valueOf).max();
		System.out.println(ii);
		Optional<Integer> fi = myList.stream().findFirst();
		;
		System.out.println("fi: "+fi);
		// List<Integer> l=
		// myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> l = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l);
		// List<Integer>l= myList.stream().filter(s -> s % 2 ==
		// 0).collect(Collectors.toList());
		// List<String>l=myList.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> lq = myList.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
		// System.out.println("f "+lq);
		/* long l= myList.stream().count(); */
		// Optional<Integer> l= myList.stream().max(Comparator.naturalOrder());
		// List<Integer> l =
		// myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		// System.out.println(l);
	}
}
