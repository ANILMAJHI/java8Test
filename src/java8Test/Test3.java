package java8Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.text.html.StyleSheet.ListPainter;

public class Test3 {

	public static void main(String[] args) {
		
		String str="This is world";
		List<Integer> l=Arrays.asList(3,4,6,3,4,1,8,5);
		Optional<Integer> is= l.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		System.out.println("is: "+is);
		
		
		//OptionalInt max=l.stream().mapToInt(Integer::valueOf).max();
		//int max=l.stream().mapToInt(Integer::valueOf).sum();
		//List<Integer> max=l.stream().filter(s->s%2==0).collect(Collectors.toList());
		//List<String> max=l.stream().map(s->s+"").filter(s->s.startsWith("3")).collect(Collectors.toList());
		List<Integer> max1=l.stream().distinct().collect(Collectors.toList());
		Integer max=l.stream().findFirst().get();
		//System.out.println(max);

		//str.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<String> map=l.stream().map(s->s+"").collect(Collectors.toList());
		System.out.println(map);
		
	}

}
