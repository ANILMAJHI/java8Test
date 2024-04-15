package java8Test;

import java.util.function.Predicate;

@FunctionalInterface
interface infe {
	public abstract void m1() ;
	public default void m2()
	{
		System.out.println("This is default void method...");
	}
	public static void m3()
	{
		System.out.println("This is static void method...");
	}
}

@FunctionalInterface
interface infe1 extends infe{
	
	public  void m1();
}
interface Test8{
	public default void m4()
	{
		//return "HTis sl";
		System.out.println("this is void method...");
	}
}
public class DefaultMehtod implements Test8 {
 public static void main(String[] args) {
	
	 Predicate<Integer> p=i->(i>10);
	 System.out.println(p.test(1));
	 DefaultMehtod d=new DefaultMehtod();
	 //d.m1();
	// infe.m1();
	
	 
	 infe.m3();
}
}
