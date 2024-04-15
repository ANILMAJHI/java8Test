package com.java8.revision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapIterator {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "aio");
		m.put(2, "bule");

		m.put(4, "sain");
		m.put(42, "sain");
		m.put(53, "gra");
		m.put(13, "all");
		m.put(34, "dur");

		Iterator<Entry<Integer, String>> itr = m.entrySet().iterator();
		/*
		 * while (itr.hasNext()) { Map.Entry<Integer, String> vEntry = itr.next(); if
		 * (vEntry.getValue().equalsIgnoreCase("all")) { itr.remove();
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * for (Map.Entry<Integer, String> forEntry : m.entrySet()) {
		 * 
		 * System.out.println(forEntry.getKey() + " : " + forEntry.getValue()); }
		 */
		List<Entry<Integer, String>> mapItr = m.entrySet().stream().filter(s->!s.getValue().equals("all")).collect(Collectors.toList());
		mapItr.forEach(System.out::println);

		
		
		List<Entry<Integer, String>> sortmap = m.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList());
//		System.out.println(sortmap);//

	}

}
