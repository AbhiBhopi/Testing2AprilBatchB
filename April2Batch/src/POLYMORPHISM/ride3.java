package POLYMORPHISM;

public class ride3 extends ride2 {       // super class method is hide
	
	public static void M1() {
		System.out.println("overiding");  // chnage implementation
		
	}
	
	public static void main(String[] args) {
		
		ride2 y = new ride2();
		y.M1();
		
	}

}
