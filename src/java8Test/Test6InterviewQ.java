package java8Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test6InterviewQ {

	public static void main(String[] args) {

		List<Integer> l2 = Arrays.asList(1, 2, 3, 4,5,2,4);
		
		List<String> frulist=Arrays.asList("banana", "apple", "cherry", "grape", "date");
		List<String> frulist1=frulist.stream().sorted().collect(Collectors.toList());
		//System.out.println(frulist1);
		List<Integer> sq=l2.stream().map(s->s*2).collect(Collectors.toList());
		//System.out.println(sq);
		List<Integer> t=l2.stream().distinct().collect(Collectors.toList());
		//System.out.println(t);
		
		//{4=[date], 5=[apple, grape], 6=[banana, cherry]} output
		Map<Integer, List<String>> d=frulist.stream().collect(Collectors.groupingBy(String::length));
		//System.out.println(d);
		
		String ss="na";
		List<String> ts=frulist.stream().filter(s->!s.contains(ss)).collect(Collectors.toList());
		System.out.println(ts);
		
		List<String> co1=frulist.stream().collect(Collectors.toList());
		//banana, apple, cherry, grape, date output instead of [banana, apple, cherry, grape, date]
		String co=frulist.stream().collect(Collectors.joining(", "));
		//System.out.println(co1);
		System.out.println(co);
		
		int su22=l2.stream().mapToInt(s->s*s).sum();
		//System.out.println(su22);
		
		/*
		 * String str1="java"; String str2="java"; String str3=new String("java");
		 * String str4=new String("java");
		 * 
		 * System.out.println(str1==str3);
		 * System.out.print("1:"+str1.hashCode()+" 2:"+str2.hashCode()+" 3:"+str3.
		 * hashCode()+" 4:"+str4.hashCode());
		 */
	}
}
