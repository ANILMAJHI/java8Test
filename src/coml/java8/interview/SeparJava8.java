package coml.java8.interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparJava8 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple1", "banana1", "mango1");
		List<String> list2 = Arrays.asList("apple2", "banana2", "mango2");
		List<String> list3 = Arrays.asList("apple3", "banana3", "mango3");


        Map<String, List<String>> groupedLists = new HashMap<>();

        // Combine all lists into a single list
        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);
        combinedList.addAll(list3);

        System.out.println(combinedList);
        // Group elements by keyword
        groupedLists = combinedList.stream()
                                   .collect(Collectors.groupingBy(
                                           str -> {
                                               if (str.contains("apple")) return "apple";
                                               else if (str.contains("banana")) return "banana";
                                               else return "mango";
                                           }
                                   ));

        // Displaying the separated lists
        groupedLists.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
