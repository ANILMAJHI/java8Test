package com.java.interviewQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Testing {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(11);
		l.add(31);
		l.add(46);
		l.add(14);
		l.add(19);

		// l.stream().sorted().forEach(System.out::println);
		List<Integer> list = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> sList = l.stream().sorted().collect(Collectors.toList());

		// System.out.println(l);

		List<String> slist = new ArrayList<String>();
		slist.add("raja");
		slist.add("rani");
		slist.add("mantri");
		slist.add("katuala");
		//slist.add(null);
		slist.add("sainik");
		slist.add("chora");

		// slist.stream().sorted().forEach(System.out::println);

		//slist.stream().filter(Objects::nonNull).forEach(System.out::println);

		// slist.stream().forEach(System.out::println);

		List<String> l1 = slist.stream().sorted().collect(Collectors.toList());
		// l.stream().forEach(System.out::print);
		List<String> l11 = slist.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		

		//l.stream().forEach(t->System.out.println(t));
		 //System.out.println(l11);
		// System.out.println(list);
	}
}
