package java8Test;

import java.util.function.BiConsumer;

public class LambdaExpDemo {

	public static void main(String[] args) {
		 
		/*
		 * LambdaExpDemo ld=new LambdaExpDemo(); ld.add(10, 20);
		 */
		BiConsumer<Integer, Integer> i1=( x, y)->
			System.out.println(x+y);
			
		i1.accept(10, 20);
		};
	}
	
	/*
	 * public static void add(int a, int b) { System.out.println(a+b); }
	 */
	

