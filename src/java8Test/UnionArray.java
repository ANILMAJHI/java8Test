package java8Test;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {
	public static void main(String[] args) {

		int[] num1 = { 80, 15, 10, 2, 35, 60 };
		int[] num2 = { 80, 20, 10, 75, 35, 60 };

		Set<Integer> s=new HashSet<>();
		
		for (int i = 0; i < num1.length; i++) {

			for (int j = 0; j < num2.length; j++) {

				if (num1[i] != num2[j]) {

					s.add(num2[j]);
					
					
				}
				
			}
		}System.out.println(s);
	}

}
