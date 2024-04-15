package java8Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindVowal  {
	
	//If the character is not found, indexOf returns -1.
	static boolean isVowal(char c)
	{
		return "aeiouAEIOU".indexOf(c)==-1;
	}
	public static void main(String[] args) {
		
		String str="anilmajhi";
		
		//str.chars().filter(ch->isVowal((char)ch)).forEach(ch -> System.out.print((char) ch));
		
		str.chars().filter(c->isVowal((char) c)).forEach(c->System.out.print((char)c));
		
		
	}
}
