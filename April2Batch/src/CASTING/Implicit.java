package CASTING;

public class Implicit {
	
	public static void main(String[] args) {
		
		byte a = 67;    // memory size is 1 byte
		System.out.println(a);
		
		int b =a;
		System.out.println(b);  // memory size is 4 byte
		
		double c = b;           // memory size is 8 b byte
		System.out.println(c);
		
	}
	
	

}
