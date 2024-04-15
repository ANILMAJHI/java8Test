import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Testing {

	static void countletter(String str) {
		
		char []ch=str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i]))
			{
				
				count++;
			}
		}
		System.out.println(str+" "+count +" letter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countletter("jav342fdda");

	}

}
