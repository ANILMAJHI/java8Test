package java8Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.OptionalInt;

public class Reduce8 {

	public static void main(String[] args) {

		int[] num= {1,2,3,4,5};
		OptionalInt d=Arrays.stream(num).reduce((s1,s2)->s1*s2);
		Arrays.stream(num).map(s->s*s).forEach(System.out::println);
		
		System.out.println(d);
		
		
		HashMap<Integer, String> h=new HashMap<>();
		h.put(1, "sa");
		h.put(1, "g");
		h.put(2, "d");
		System.out.println(h);
	}

}
