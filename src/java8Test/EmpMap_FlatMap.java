package java8Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpMap_FlatMap {

	public static void main(String[] args) {

		
		List<String> citiWorkedIn1= new ArrayList<String>();
		citiWorkedIn1.add("Pune");
		citiWorkedIn1.add("Bangalore");
		citiWorkedIn1.add("Hyd");
		citiWorkedIn1.add("Bbsr");
		Employee e1=new Employee(1, "Anil", citiWorkedIn1);
		
		List<String> citiWorkedIn2= new ArrayList<String>();
		citiWorkedIn2.add("Pune");
		citiWorkedIn2.add("Bangalore");
		citiWorkedIn2.add("Hyd");
		Employee e2=new Employee(2, "Pinku", citiWorkedIn2);
		

		List<String> citiWorkedIn3= new ArrayList<String>();
		citiWorkedIn3.add("Pune");
		citiWorkedIn3.add("Bangalore");
		Employee e3=new Employee(3, "Ram", citiWorkedIn3);
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println(empList);
		
		Set<List<String>> map=empList.stream().map(s->s.getCitisWorkedIn()).collect(Collectors.toSet());
		System.out.println("map: "+map);
		
		Set<String> flateMap=empList.stream().flatMap(s->s.getCitisWorkedIn().stream()).collect(Collectors.toSet());
		System.out.println("flateMap: "+flateMap);
		
	}

}
