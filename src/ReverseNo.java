import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseNo {

	public static void main(String[] args) {
		int[] num = { 1, 2, 2, 2, 3, 3, 3, 3, 5, 5, 5, 5, 5 };
		
		Map<Integer, Long> count=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		count.forEach((valu, counts)->{
			if(counts>1)
			{
				System.out.println(valu+":"+counts);
			}
		});
		
	}

}
