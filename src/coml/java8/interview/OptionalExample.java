package coml.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalExample {

	public static void main(String[] args) {

		   // Creating an Optional object with a non-null value
        Optional<String> optional1 = Optional.of("Hello");
        System.out.println("optional1:"+optional1);
        
        // Creating an empty Optional object
        Optional<String> optional2 = Optional.empty();
        System.out.println("optional2:"+optional2);
        
        // Creating an Optional object with a nullable value
        String nullableValue = "World";
        Optional<String> optional3 = Optional.ofNullable(nullableValue);
        
        // Checking if the Optional contains a value
        System.out.println("Is optional1 present? " + optional1.isPresent()); // Output: true
        System.out.println("Is optional2 present? " + optional2.isPresent()); // Output: false
        
        // Getting the value from the Optional object
        System.out.println("Value of optional1: " + optional1.get()); // Output: Hello
        
        // If the Optional is empty, use a default value
        String valueOrDefault = optional2.orElse("Default Value");
        System.out.println("Value of optional2 (or default): " + valueOrDefault); // Output: Default Value
        
        // If the Optional is not empty, perform some action
        optional3.ifPresent(value -> System.out.println("Value of optional3: " + value)); // Output: World
        
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 1, 5, 3, 6, 7, 9, 9);
        
        Optional<Integer> max = number.stream().max(Integer::compareTo);
        max.ifPresent(maxValue -> System.out.println("Maximum value: " + maxValue));
        
        
        List<Integer> number1 = Arrays.asList(2, 3, 4, 5, 1, 5, 3, 6, 7, 9, 9);
        Optional<Integer> firstEven = number1.stream().filter(num -> num % 2 == 0).findFirst();
        firstEven.ifPresent(evenNum -> System.out.println("First even number: " + evenNum));
        
        int[] no = {2, 3, 4, 5, 1, 5, 3, 6, 7, 9, 9};
        
        int searchNum = 5;
        OptionalInt result = Arrays.stream(no).filter(num -> num == searchNum).findFirst();
        result.ifPresent(num -> System.out.println(searchNum + " is present in the array"));
	}

}
