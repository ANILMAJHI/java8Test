package java8Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class SecondHigestSal7 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(11, 21, 31, 61, 41, 71, 31, 51, 71);
		
		//3rd higest no using java8
		Integer i1=l.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).collect(Collectors.toList()).get(0);
		
		System.out.println("3rd higest: "+i1);
		List<Integer> list = new ArrayList<>(l);
		Collections.sort(list);
		for (int i = list.size() - 2; i > 0; i--) {
			if (list.get(i) != list.get(i - 2)) {
				int secLarg = list.get(i - 2);
				System.out.println("3nd Largest is: " + secLarg);
				return;
			}

		}

	}

}
