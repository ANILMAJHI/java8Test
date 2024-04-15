package java8Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapStreamIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> customers = new HashMap<>();
		customers.put(1, "Jhon");
		customers.put(2, "Smith");
		customers.put(3, "Sally");
		
		customers.entrySet().stream().forEach(System.out::println);
		
		List<Entry<Integer, String>> s=customers.entrySet().stream().filter(ss->ss.getValue().equals("Smith")).collect(Collectors.toList());
		//System.out.println(s);

	}

}
