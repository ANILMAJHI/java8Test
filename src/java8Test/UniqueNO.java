package java8Test;

public class UniqueNO {

	public static void main(String[] args) {

		int[] num = { 1, 2, 2 };
		// Arrays.stream(num).distinct().forEach(System.out::println);

		for (int i = 0; i < num.length; i++) {
			boolean flage = true;
			for (int j = i + 1; j < num.length; j++) {
				if (i != j && num[i] == num[j]) {
					flage = false;
					break;
				}
				// System.out.println(num[j]);
			}
			if (flage) {
				System.out.print(num[i]+",");
			}
		}

	}

}
