package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Spliterator;

public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Employee> m = new HashMap<>();
		Employee emp1=new Employee(1, "anil", "Angul", 30000);
		Employee emp2=new Employee(2, "pinku", "Cuttack", 12000);
		Employee emp3=new Employee(5, "Hari", "Puri", 50000);
		Employee emp4=new Employee(3, "Dhaba", "Bbsr", 15000);
		m.put(1, emp1);
		m.put(2, emp2);
		m.put(4, emp3);
		m.put(3, emp4);
		
		
		Entry<Integer, Employee> emp=null;
		Iterator<Entry<Integer, Employee>> itr= m.entrySet().iterator();
		while(itr.hasNext())
		{
			emp=itr.next();
			//System.out.println(emp);
			if(emp.getValue().getAddress().equalsIgnoreCase("Cuttack"))
			{
				System.out.println(emp);
			}
		}
		
	}

}
