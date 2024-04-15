package java8Test;

import java.util.StringJoiner;

public class Joiner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner stj1=new StringJoiner(",","[","]");
		stj1.add("A").add("B").add("C");
		System.out.println(stj1);
		
		StringJoiner stj2=new StringJoiner(":");
		stj2.add("P").add("Q");
		System.out.println(stj2);
		
		stj1.merge(stj2);
		System.out.println(stj1);
	}

}
