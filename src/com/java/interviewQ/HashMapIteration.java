package com.java.interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(2, "Saket");
		map.put(25, "Saurav");
		map.put(12, "HashMap");

		ArrayList<String> li = new ArrayList<>();

		for (String value : map.values()) {
			li.add(value);
		}
		System.out.println(li);

		Iterator<Entry<Integer, String>> itr1 = map.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> d = itr1.next();
			// System.out.println("d: "+d);
			if (d.getValue().equalsIgnoreCase("Saket")) {
				System.out.println(" " + d);
			}
		}

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {

			@SuppressWarnings("unchecked")
			Map.Entry m = (Map.Entry) itr.next();
			// System.out.println("key is:" + m.getKey() + "..." + "Value is:" +
			// m.getValue());

		}

		for (Map.Entry me : map.entrySet()) {
			System.out.println("for loop key is:" + me.getKey() + "..." + "Value :" + me.getValue());
		}
	}

}
