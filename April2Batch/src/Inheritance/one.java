package Inheritance;

 class one {
	
	public static void greetings() {
		System.out.println("Hello");
	}
}
	class Two extends one{
		
		public static void greetings() {
			System.out.println("hi");
			
		}
	}

public class Test{
	public static void main(String[] args) {
		one One = new Two();
		One.greetings();
		
		
		
	}
	
	
}
