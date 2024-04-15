package java8Test;

import java.util.Arrays;
import java.util.LinkedList;

public class Test7 {
	public static void sequnceZeroOne(int[] no) {

		LinkedList<Integer> l = new LinkedList();
		for (int i = 0; i < no.length; i++) {

			if (no[i] % 2 == 0) {
				l.addFirst(no[i]);
			} else if (no[i] % 2 != 0) {
				l.addLast(no[i]);
			}

		}
		System.out.println(l);
	}

	public static void main(String[] args) {

		int[] n = { 1, 0, 1, 0, 1, 0, 1, 0 };
		
		//sequnceZeroOne(n);
		
		Arrays.stream(n).sorted().forEach(System.out::print);
	}
}
