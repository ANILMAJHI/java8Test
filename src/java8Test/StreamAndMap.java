package java8Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAndMap {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2, 3, 4,5,7,8);
		List<String> l=Arrays.asList("orange","banana","apple","orange","apple");
		
		String str="This is the word in java programing of this in line";
		String ch[]=str.split("\\s+");
		Map<String, Long> ssd=Arrays.stream(ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("ssd :"+ssd);
		
		//Arrays.stream(ch).collect(Collectors.groupingBy(s->s, Collectors.counting())).forEach((s, s1)->System.out.println(s+","+s1));
		Map<String, Long> d=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//System.out.println(d);
		
		//l.stream().map(s->s.split("")).collect(Collectors.groupingBy(Function<String, Integer>) Collectors.counting()));
		//System.out.print("apple: "+ud);
		
		
		//number.stream().map(s->s*s).forEach(System.out::println);

		//number.parallelStream().filter(s->s%2==0).forEach(System.out::println);
	}

}
