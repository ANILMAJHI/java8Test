package java8Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 6, 4, 7, 3, 5, 7);
		
		int su2=l.stream().mapToInt(Integer::valueOf).sum();
		//System.out.println("sum: "+su2);
		
		List<String> ddw=l.stream().map(s->s+"").filter(s->s.startsWith("5")).collect(Collectors.toList());
		//System.out.println("ddw: "+ddw);
		Optional<Integer> thd=l.stream().sorted(Comparator.reverseOrder()).skip(2).max(Comparator.comparing(Integer::valueOf));
		//System.out.println("thd: "+thd);
		int su=l.stream().map(s->s*s).filter(s->s%2==0).mapToInt(Integer::valueOf).sum();
		//System.out.println("sum of even no squre: "+su);
		String str = "this is the string value the this is";
		int seco=l.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).collect(Collectors.toList()).get(0);
		//System.out.println("second hig: "+seco);
		List<Integer> dv=l.stream().filter(s->s%2==0).collect(Collectors.toList());
		//System.out.println(dv);
		
		// even no sum
		int even = l.stream().filter(s -> s % 2 == 0).mapToInt(Integer::valueOf).sum();
		 System.out.println(even);

		// start 4
		List<String> sl = l.stream().map(s -> s + "").filter(s -> s.startsWith("4")).collect(Collectors.toList());
		// System.out.println(sl);

		// count char
		Map<String, Long> d = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 System.out.println(d);

		//
		List<Integer> dis = l.stream().collect(Collectors.toList());
		// System.out.println(dis);

		// 2nd higest no
		Integer id = l.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).collect(Collectors.toList())
				.get(0);
		// System.out.println(id);

		// small no
		Optional<Integer> min = l.stream().min(Comparator.comparing(Integer::valueOf));
		Optional<Integer> min1 = l.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
		OptionalInt min2 = l.stream().mapToInt(Integer::valueOf).max();

		// System.out.println(min2);

		// count how many no.
		Long c = l.stream().count();
		// System.out.println(c);

		List<Integer> sor = l.stream().collect(Collectors.toList());
		//System.out.println(sor);

		Set<Integer> dd = l.stream().map(s -> s * s).filter(s -> s % 2 != 0).collect(Collectors.toSet());
		//System.out.println(dd);
	}
}
