package com.java.interviewQ;

import java.util.Arrays;
import java.util.List;

public class Testing3 {

	public static void main(String[] args) {
		String str = "this is doog to the employee";
		List<String> name = Arrays.asList("ram", "same", "karan", "manosh");

		//Arrays.stream(str.split("\\s+")).filter(s -> s.startsWith("t")).forEach(System.out::println);
		//length more then 4 char
		name.stream().filter(s->s.length()>4).forEach(System.out::println);
		
	}

}
