package java8Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapStreamIterator {

	
	private static Optional<String> findCustomerName(Map<Integer,String> customers,String targetName)
	{
		return customers.entrySet().stream().filter(s->s.getValue().equalsIgnoreCase(targetName)).map(Map.Entry::getValue).findFirst();
	}
	public static void main(String[] args) {


		Map<Integer, String> customers = new HashMap<>();
		customers.put(1, "Jhon");
		customers.put(2, "Smith");
		customers.put(3, "Sally");
		
		Optional<String> smithCustomerId=findCustomerName(customers, "Jhon");
		if(smithCustomerId.isPresent())
		{
			System.out.println("customer is:"+customers);
		}
		else {
			System.out.println("customer not available...");
		}
	}

}
