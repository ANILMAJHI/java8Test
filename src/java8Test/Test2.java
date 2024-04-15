package java8Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Test1
{
	static int  add(int a, int b)
	{
		return a+b;
	}
}
public class Test2 extends Test1 {

	public static void main(String[] args) {
		Test2 t=new Test2();
		short s=9;
		System.out.println(Test1.add(s,6));
		ExecutorService executor=Executors.newFixedThreadPool(4);
		for (int i = 0; i < 10; i++) {
			final int taskNo=i;
			executor.submit(()->{
				System.out.println("task no is: "+taskNo+", executed by : "+Thread.currentThread().getName());
			});
		}
		
		executor.shutdown();

	}
}
