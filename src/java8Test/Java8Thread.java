package java8Test;

import java.util.Arrays;
import java.util.List;

public class Java8Thread {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2, 3, 5, 4);
		l.parallelStream().forEach(s -> {
			System.out.println(s+":"+Thread.currentThread().getName());

		});
	}
}
