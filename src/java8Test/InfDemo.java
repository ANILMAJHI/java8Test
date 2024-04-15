package java8Test;

public interface InfDemo {
	
	default void display()
	{
		System.out.println("Demo Interface...");
	}
	void m1();
	static void m12()
	{
		System.out.println("static method...");
	}

}
