package POLYMORPHISM;

public class poly1 {
	
	public void adddition(int a, int b) {
		
		
		System.out.println("addition = "+(a+b));
	}
	
	public void adddition(int a, int b,int c) {
		
		
		System.out.println("addition = "+(a+b+c));
	}
	
	public static void main(String[] args) {
		poly1 x = new poly1();
		
		x.adddition(100, 200);
		x.adddition(300, 400, 500);
	}
	
}
