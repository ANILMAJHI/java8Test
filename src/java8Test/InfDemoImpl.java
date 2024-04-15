package java8Test;

public class InfDemoImpl implements InfDemo, InfDemo1 {

	public static void main(String[] args) {

		// InfDemo i = () -> System.out.println("Hello Imple class java 8...");

		InfDemoImpl t = new InfDemoImpl();
		t.display();
		
		
		// i.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		InfDemo1.super.display();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
