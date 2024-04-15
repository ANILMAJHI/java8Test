package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test7 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Ram");
		m.put(2, "Sita");
		m.put(7, "Hanuman");
		m.put(5, "Laxman");

		m.forEach((k,v)->System.out.println(k+"="+v));
		System.out.println("---------------");
		
		Iterator<Entry<Integer, String>> itr = m.entrySet().iterator();
		Entry<Integer, String> entry = null;
		while (itr.hasNext()) {
			entry = itr.next();
			System.out.println(entry);
		}

	}
}
