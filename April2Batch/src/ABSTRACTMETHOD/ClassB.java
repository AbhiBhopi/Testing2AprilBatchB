package ABSTRACTMETHOD;

public class ClassB extends ClassA{
	
	public static void main(String[] args) {
		ClassA.set(6789);
		
		ClassB x = new ClassB();
		
		
		
		int y = x.get();
		System.out.println(y);
		
	}

}
