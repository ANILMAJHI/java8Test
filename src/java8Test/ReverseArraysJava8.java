package java8Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArraysJava8 {

	public static void main(String[] args) {

		 int[] num = { 2, 3, 4, 1, 6, 9, 7, 4, 0 };
		 List<Integer> sortar=Arrays.stream(num).boxed().sorted((a,b)->-b.compareTo(a)).collect(Collectors.toList());
		 System.out.println(sortar);
		 
	}

}
